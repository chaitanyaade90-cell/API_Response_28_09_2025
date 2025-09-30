package Pckg_Json_30_09_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Api_Response_2 {
	
	/* Lan Id=262
	 * 
	 * Date- 30/09/2025
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void GetResponse() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("Response= " + response.getStatusCode());
		
		System.out.println("API RESPONSE CODE " + response.statusCode());
		
		System.out.println("ids are " + response.jsonPath().get("id"));
		
		System.out.println("names are " + response.jsonPath().get("name"));
		
		System.out.println("price are " + response.jsonPath().get("data.price"));
		
		
		
	}  

}
