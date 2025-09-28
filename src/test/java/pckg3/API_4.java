package pckg3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_4 {
	
	@Test
	public void Get200code(){
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response: " + response.asPrettyString());
		
		// Assertion
		
		System.out.println("API RESPONSE CODE " + response.getStatusCode());
	}

}
