
grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)


grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.work.dir = "target/work"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.war.file = "target/${appName}.war"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.war.resources = { stagingDir ->
    if(new File("${stagingDir}/development").exists())
        delete(includeEmptyDirs: true) { fileset dir: "${stagingDir}/development" }
        
    delete(includeEmptyDirs: true) { fileset dir: "${stagingDir}/art sample" }
    delete(includeEmptyDirs: true) { fileset dir: "${stagingDir}/xmlSample" }
}


grails.project.fork = [
    // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
    //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

    // configure settings for the test-app JVM, uses the daemon by default
    test: [maxMemory: 512, minMemory: 64, debug: false, maxPerm: 256, daemon:true],
    // configure settings for the run-app JVM
    run: [maxMemory: 512, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the run-war JVM
    war: [maxMemory: 512, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the Console UI JVM
    console: [maxMemory: 512, minMemory: 64, debug: false, maxPerm: 256]
]
grails.project.dependency.resolver = "maven" // or ivy



grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
        mavenRepo "http://repo.spring.io/milestone/"
    }

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.

        runtime 'mysql:mysql-connector-java:5.1.24'
        compile 'org.imgscalr:imgscalr-lib:4.2'
        runtime 'net.java.dev.jets3t:jets3t:0.9.0'
        runtime 'org.jsoup:jsoup:0.2.2'
        compile 'org.compass-project:compass:2.2.0' 

    }

    plugins {
        // plugins for the build system only
        build ':tomcat:7.0.47'
        

        // plugins for the compile step
        compile ":scaffolding:2.0.0"
        compile ':cache:1.1.1'

        // plugins needed at runtime but not for compilation
        runtime ':hibernate:3.6.10.6'
        // runtime ':hibernate4:4.1.11.4'
        runtime ":database-migration:1.3.5"
        runtime ":jquery:1.8.3"
        runtime ":resources:1.2"


        // add plugin
        // compile ':spring-security-core:1.2.7.3'
        compile ":spring-security-core:2.0-RC2"

        runtime ':jquery-ui:1.8.24'

        runtime ":browser-detection:0.4.3"
        runtime ":modernizr:2.6.2"

        compile ":taggable:1.0.1"
        compile ":ajax-uploader:1.1"

        compile ":csv:0.3.1"
        compile ":google-analytics:2.1.1"

        compile ":disqus:0.1"

        compile ":searchable:0.6.6"



    }
}
