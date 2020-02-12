# jfrog-api-tests
Test rest apis with restAssured and testng.

### Requirements
```
Java 8 or higher
Gradle
Artifactory OSS up and running (with generic repositories enabled)
```

## Configuration

### Test enviroment details

Can be changed in file autotestConfig.properties under src/test/resources. 
Credentials to be used by rest apis for basic authentication.
```
test.environment.url=http://localhost:8081
test.environment.username=admin
test.environment.password=password
```

## Usage
To run the test
```
./gradlew clean test
```

## Reports

Reports can ve viewed in the directory -> build/reports/tests/test/emailable-report.html
