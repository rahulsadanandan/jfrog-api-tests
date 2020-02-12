package com.jfrog.autotest.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasEntry;
import org.testng.annotations.Test;

public class RepositoryTest {

	
	
	
	@Test(priority = 1)
	public void ListRepositories() {
		given()
		.when()
			.get("/artifactory/api/repositories")
		.then()
			.statusCode(200)
			.body("", hasItems(hasEntry("type", "LOCAL")));
	}
	
	
	
	
	
	
	
}
