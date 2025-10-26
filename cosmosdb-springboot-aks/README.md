### Source code
[cosmosdb-springboot-aks](https://github.com/Azure-Samples/cosmosdb-springboot-aks.git)

### Login to Azure from Azure CLI
	PowerShell
	azd auth login
	
### Configure CosmosDB for Spring Boot application
	azure.cosmos.uri=https://<enter Azure Cosmos DB db account name>.azure.com:443/
	azure.cosmos.key=<enter Azure Cosmos DB db primary key>
	azure.cosmos.database=<enter Azure Cosmos DB db database name>
	azure.cosmos.queryMetricsEnabled=true
	azure.cosmos.responseDiagnosticsEnabled=true

### Run
	java -jar target/users-api-0.0.1-SNAPSHOT.jar
	or from Visual Studio Code, start
	CosmosdbSpringApplication
	
### Test
	curl -X POST http://localhost:8080/users -H "Accept: application/json" -H "Content-Type:application/json" -d @user.json
	
