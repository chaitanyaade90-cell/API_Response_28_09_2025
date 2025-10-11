package Package_Response_11_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Response_3 {
	
	@Test
	public void GetResponse200() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response : " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("Response = " + response.statusCode());
		
		System.out.println("id are : " + response.jsonPath().get("id"));
		
		System.out.println("name value are : " + response.jsonPath().get("name"));
		
		System.out.println("Data value are : " + response.jsonPath().get("Data.price"));
	}

}
