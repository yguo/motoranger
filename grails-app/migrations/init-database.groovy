databaseChangeLog = {

	changeSet(author: "Spooky (generated)", id: "1386911291407-1") {
		createTable(tableName: "brand") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "brandPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "homepage", type: "varchar(255)")

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "type", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-2") {
		createTable(tableName: "event") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "eventPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "creator", type: "varchar(255)")

			column(name: "date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "discount_money", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "mileage", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "product_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "received_money", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "status", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "store_id", type: "bigint")

			column(name: "total_price", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-3") {
		createTable(tableName: "event_detail") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "event_detailPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cost", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "creator", type: "varchar(255)")

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "head_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "main_image", type: "varchar(255)")

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "part_id", type: "bigint")

			column(name: "price", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "qty", type: "integer") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-4") {
		createTable(tableName: "part") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "partPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cost", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "creator", type: "varchar(255)")

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "main_image", type: "varchar(255)")

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "price", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "stock_count", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "store_id", type: "bigint")

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-5") {
		createTable(tableName: "persistent_logins") {
			column(name: "series", type: "varchar(64)") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "persistent_loPK")
			}

			column(name: "last_used", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "token", type: "varchar(64)") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "varchar(64)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-6") {
		createTable(tableName: "post") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "postPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "content", type: "longtext")

			column(name: "creator", type: "varchar(255)")

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "hits", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "main_image", type: "varchar(255)")

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "product_id", type: "bigint")

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "type", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-7") {
		createTable(tableName: "product") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "productPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "brand_id", type: "bigint")

			column(name: "cc", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "cost", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "creator", type: "varchar(255)")

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "main_image", type: "varchar(255)")

			column(name: "mileage", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "price", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "status", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint")

			column(name: "years", type: "datetime")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-8") {
		createTable(tableName: "role") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rolePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-9") {
		createTable(tableName: "security_map") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "security_mapPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "config_attribute", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "url", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-10") {
		createTable(tableName: "store") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "storePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "address", type: "varchar(255)")

			column(name: "description", type: "varchar(255)")

			column(name: "email", type: "varchar(255)")

			column(name: "fax", type: "varchar(255)")

			column(name: "mobile", type: "varchar(255)")

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "telphone", type: "varchar(255)")

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-11") {
		createTable(tableName: "store_cost_detail") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "store_cost_dePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cost", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "store_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-12") {
		createTable(tableName: "tag_links") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "tag_linksPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "tag_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "tag_ref", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "type", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-13") {
		createTable(tableName: "tags") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "tagsPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-14") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "address", type: "varchar(255)")

			column(name: "description", type: "varchar(255)")

			column(name: "email", type: "varchar(255)")

			column(name: "enabled", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "mobile", type: "varchar(255)")

			column(name: "password", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "store_id", type: "bigint")

			column(name: "telphone", type: "varchar(255)")

			column(name: "title", type: "varchar(255)")

			column(name: "username", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-15") {
		createTable(tableName: "user_role") {
			column(name: "role_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-16") {
		addPrimaryKey(columnNames: "role_id, user_id", constraintName: "user_rolePK", tableName: "user_role")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-32") {
		createIndex(indexName: "name_uniq_1386911291299", tableName: "brand", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-33") {
		createIndex(indexName: "FK5C6729A7F6629BE", tableName: "event") {
			column(name: "store_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-34") {
		createIndex(indexName: "FK5C6729A94F1E5B6", tableName: "event") {
			column(name: "user_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-35") {
		createIndex(indexName: "FK5C6729ACDEEADFE", tableName: "event") {
			column(name: "product_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-36") {
		createIndex(indexName: "name_uniq_1386911291309", tableName: "event", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-37") {
		createIndex(indexName: "FK24C4619647AF3A18", tableName: "event_detail") {
			column(name: "head_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-38") {
		createIndex(indexName: "FK24C461966E7114B6", tableName: "event_detail") {
			column(name: "part_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-39") {
		createIndex(indexName: "name_uniq_1386911291316", tableName: "event_detail", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-40") {
		createIndex(indexName: "FK3463F310475694", tableName: "part") {
			column(name: "user_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-41") {
		createIndex(indexName: "FK3463F37F6629BE", tableName: "part") {
			column(name: "store_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-42") {
		createIndex(indexName: "name_uniq_1386911291318", tableName: "part", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-43") {
		createIndex(indexName: "FK3498A0CDEEADFE", tableName: "post") {
			column(name: "product_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-44") {
		createIndex(indexName: "name_uniq_1386911291322", tableName: "post", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-45") {
		createIndex(indexName: "FKED8DCCEF16985FFE", tableName: "product") {
			column(name: "brand_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-46") {
		createIndex(indexName: "FKED8DCCEF94F1E5B6", tableName: "product") {
			column(name: "user_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-47") {
		createIndex(indexName: "name_uniq_1386911291325", tableName: "product", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-48") {
		createIndex(indexName: "authority_uniq_1386911291326", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-49") {
		createIndex(indexName: "url_uniq_1386911291327", tableName: "security_map", unique: "true") {
			column(name: "url")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-50") {
		createIndex(indexName: "name_uniq_1386911291328", tableName: "store", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-51") {
		createIndex(indexName: "FK70D582A57F6629BE", tableName: "store_cost_detail") {
			column(name: "store_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-52") {
		createIndex(indexName: "unique_title", tableName: "store_cost_detail", unique: "true") {
			column(name: "date")

			column(name: "title")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-53") {
		createIndex(indexName: "FK7C35D6D45A3B441D", tableName: "tag_links") {
			column(name: "tag_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-54") {
		createIndex(indexName: "name_uniq_1386911291335", tableName: "tags", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-55") {
		createIndex(indexName: "FK36EBCB7F6629BE", tableName: "user") {
			column(name: "store_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-56") {
		createIndex(indexName: "username_uniq_1386911291338", tableName: "user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-57") {
		createIndex(indexName: "FK143BF46A94F1E5B6", tableName: "user_role") {
			column(name: "user_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-58") {
		createIndex(indexName: "FK143BF46AEFC721D6", tableName: "user_role") {
			column(name: "role_id")
		}
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-17") {
		addForeignKeyConstraint(baseColumnNames: "product_id", baseTableName: "event", constraintName: "FK5C6729ACDEEADFE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-18") {
		addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "event", constraintName: "FK5C6729A7F6629BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-19") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "event", constraintName: "FK5C6729A94F1E5B6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-20") {
		addForeignKeyConstraint(baseColumnNames: "head_id", baseTableName: "event_detail", constraintName: "FK24C4619647AF3A18", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "event", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-21") {
		addForeignKeyConstraint(baseColumnNames: "part_id", baseTableName: "event_detail", constraintName: "FK24C461966E7114B6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "part", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-22") {
		addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "part", constraintName: "FK3463F37F6629BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-23") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "part", constraintName: "FK3463F310475694", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-24") {
		addForeignKeyConstraint(baseColumnNames: "product_id", baseTableName: "post", constraintName: "FK3498A0CDEEADFE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-25") {
		addForeignKeyConstraint(baseColumnNames: "brand_id", baseTableName: "product", constraintName: "FKED8DCCEF16985FFE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "brand", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-26") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "product", constraintName: "FKED8DCCEF94F1E5B6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-27") {
		addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "store_cost_detail", constraintName: "FK70D582A57F6629BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-28") {
		addForeignKeyConstraint(baseColumnNames: "tag_id", baseTableName: "tag_links", constraintName: "FK7C35D6D45A3B441D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "tags", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-29") {
		addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "user", constraintName: "FK36EBCB7F6629BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-30") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK143BF46AEFC721D6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}

	changeSet(author: "Spooky (generated)", id: "1386911291407-31") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK143BF46A94F1E5B6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
