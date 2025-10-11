package Package_Response_11_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Response_1 {
	
	@Test
	public void Response200() {
		
		Response Response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Response : " + Response.asPrettyString());
		
		//Assertion
		
		System.out.println("Response = " + Response.statusCode());
		
		System.out.println("id are : " + Response.jsonPath().get("id"));
		
		System.out.println("name value are : " + Response.jsonPath().get("name"));
		
		System.out.println("data value are : " + Response.jsonPath().get("data.price"));
			
	}
	

}
