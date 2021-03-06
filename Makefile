#remote_addr=192.168.0.107
remote_addr=motoranger.net
remote_user=spooky


server:
#	export GRAILS_OPTS="-XX:MaxPermSize=1024m -Xmx1024M -server"
	grails run-app

clean:
	grails clean


war:
	grails war

submoduleInstall:
	git submodule init
	git submodule update

remote-init:
	ssh -t ${remote_user}@${remote_addr} 'sudo mkdir -p /usr/share/tomcat7/.grails \
	&& sudo mkdir -p /usr/share/tomcat7/.grails/projects/motoranger/searchable-index/production/index/product \
	&& sudo chgrp -R tomcat7 /usr/share/tomcat7 \
	&& sudo chmod -R 770 /usr/share/tomcat7'

deployConfig:
	scp ~/.grails/motoranger-config.groovy ${remote_user}@${remote_addr}:~/
	ssh -t ${remote_user}@${remote_addr} \
	'sudo cp motoranger-config.groovy /usr/share/tomcat7/.grails/ \
	&& sudo service tomcat7 restart'

dbinit:
	CREATE DATABASE motoranger DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
	create user 'motoranger'@'localhost' identified by 'mvagusta';
	grant all on *.* to 'motoranger'@'localhost';


done:
	make clean war deployWar
	

deployWar:
	scp target/motoranger.war ${remote_user}@${remote_addr}:~/ROOT.war
	ssh -t ${remote_user}@${remote_addr} \
	'cd ~/ \
	&& sudo rm -rf /var/lib/tomcat7/webapps/ROOT \
	&& sudo cp ROOT.war /var/lib/tomcat7/webapps/ \
	&& sudo cp motoranger-config.groovy /usr/share/tomcat7/.grails/ \
	&& sudo service tomcat7 restart'

log:
	ssh -t ${remote_user}@${remote_addr} 'sudo tail -f /var/lib/tomcat7/logs/catalina.out'




syncdb:
	ssh -t ${remote_user}@${remote_addr} 'mysqldump --user=root -p motoranger > ~/backup/motoranger.sql'

recoverdb:
	mysql -u root -p motoranger < motoranger.sql


loglink:
	- mkdir ~/Library/Logs/motoranger
	- touch target/development.log
	- touch target/test.log
	- touch target/grails.log
	- touch target/root.log
	- touch target/stacktrace.log
	- ln ~/projects/motoranger/target/development.log ~/Library/Logs/motoranger/development.log
	- ln ~/projects/motoranger/target/grails.log ~/Library/Logs/motoranger/grails.log
	- ln ~/projects/motoranger/target/root.log ~/Library/Logs/motoranger/root.log
	- ln ~/projects/motoranger/target/stacktrace.log ~/Library/Logs/motoranger/stacktrace.log
	- ln ~/projects/motoranger/target/test.log ~/Library/Logs/motoranger/test.log

#dbCreate = "create" 必須使用實體 db ex:mysql
db-changelog-init:
	grails dbm-generate-gorm-changelog changelog.groovy 
	

#remove dbCreate = "create"
db-changelog-sync:
	grails -Dgrails.env=dbdiff dbm-changelog-sync
db-update:
	grails -Dgrails.env=dbdiff dbm-update
db-diff:
	grails -Dgrails.env=dbdiff dbm-gorm-diff temp.groovy -add
