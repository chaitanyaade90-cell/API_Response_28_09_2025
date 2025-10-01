package pckg_01_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse200_1 {
	
	@Test
	public void GetResponse() {
		
		Response response = RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response : " + response.asPrettyString());
		
		// Assertion
		
		System.out.println("API RESPONSE CODE = " + response.statusCode());
		
		System.out.println("id are : " + response.jsonPath().get("id"));
		
		System.out.println("name values are : " + response.jsonPath().get("name"));
		
		System.out.println("data values are : " + response.jsonPath().get("data.price"));
		
	}

}
