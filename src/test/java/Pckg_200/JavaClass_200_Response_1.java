package Pckg_200;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JavaClass_200_Response_1 {
	
	@Test
	public void Get200Code() {
		
		Response response = RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response: " + response.asPrettyString() );
		
		//Assertion
		
		System.out.println("API RESPONSE CODE : " + response.getStatusCode());
		
		System.out.println("id are: "  + response.jsonPath().get("id"));
		
		System.out.println("name value are: " + response.jsonPath().get("name"));
		
		System.out.println("data price are: " + response.jsonPath().get("data.price"));
	}

}
