package pckg_30_09_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Publish200_GetCode {
	
	@Test
	public void GetResponseCode() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response : " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE= " + response.statusCode());
		
		System.out.println("id are: " + response.jsonPath().get("id"));
		
		System.out.println("name value are : " + response.jsonPath().get("name"));
		
		System.out.println("data value are : " + response.jsonPath().get("data.value"));
	}
	
	   

}
