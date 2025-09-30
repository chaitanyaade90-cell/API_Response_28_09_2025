package Pckg_Json_30_09_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Api_Response_1 {
	
	@Test
	public void ApiResponse200() {
		
		Response response= RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE= " + response.statusCode());
		
		System.out.println("ids are " + response.jsonPath().get("id"));
		
		System.out.println("name are " + response.jsonPath().get("name"));
		
		System.out.println("price values are " + response.jsonPath().get("data.price"));
	}

}
