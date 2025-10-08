package Pckg_08_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Response_4 {
	
	@Test
	public void Get200() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Response : " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("Response = " + response.asPrettyString());
		
		System.out.println("Response : " + response.statusCode());
		
		System.out.println("id are : " + response.jsonPath().get("id"));
		
		System.out.println("name value are : " + response.jsonPath().get("name value are"));
		
		System.out.println("data value are : " + response.jsonPath().get("data.price"));
	}

}
