package Pckg_13_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class response_4 {
	
	@Test
	public void Get200() {
		
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
	    
		System.out.println("Response: "+ response.asPrettyString());
		
		System.out.println("Response = " + response.statusCode());
	}
	
	

}
