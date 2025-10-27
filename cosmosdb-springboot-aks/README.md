### Login to Azure from Azure CLI
	PowerShell
	azd auth login
	
### Configure CosmosDB for Spring Boot application
	azure.cosmos.uri=https://<enter Azure Cosmos DB db account name>.azure.com:443/
	azure.cosmos.key=<enter Azure Cosmos DB db primary key>
	azure.cosmos.database=<enter Azure Cosmos DB db database name>
	azure.cosmos.queryMetricsEnabled=true
	azure.cosmos.responseDiagnosticsEnabled=true

### Use Lombok 
    The built-in extension "Extension Pack for Java" is already installed

### Run
	java -jar target/users-api-0.0.1-SNAPSHOT.jar
	or from Visual Studio Code, start
	CosmosdbSpringApplication
	
### Test
	curl -i -X POST http://localhost:8080/users -H "Accept: application/json" -H "Content-Type:application/json" -d @user1.json
	curl -i -X POST http://localhost:8080/users -H "Accept: application/json" -H "Content-Type:application/json" -d @user2.json

	curl -i http://localhost:8080/users
	curl -i http://localhost:8080/users/john.doe@foobar.com
	
	curl -i http://localhost:8080/users/john.nonexist@foobar.com
	
	curl -i -X PUT http://localhost:8080/users -H "Accept: application/json" -H "Content-Type:application/json" -d @user2.json
	
	curl -i -X DELETE http://localhost:8080/users/john.doe@foobar.com

## Using CosmosDB Emulator

### Emulator console
https://localhost:8081/_explorer/index.html

### SSL cert
keytool -printcert -sslserver localhost:8081 -rfc > cosmosdb-local.crt  
Copy java cacerts to ./truststore/  
keytool -importcert -alias cosmosdb-local -file cosmosdb-local.crt -trustcacerts -keystore truststore/cacerts -storepass changeit  
Add VM option in Visual Studio Code:  
View - Run - create launch.json - Java - Java: Launch Program in current file  
"vmArgs": "-Djavax.net.ssl.trustStore=C:/cosmosdb-springboot-aks/truststore/cacerts -Djavax.net.ssl.trustStorePassword=changeit"  

