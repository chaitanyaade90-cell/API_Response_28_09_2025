package Pckg6;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponce_1 {
	
	@Test
	public void Getresponce200() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assure
		
		System.out.println("API RESPONSE CODE= " + response.getStatusCode());
		
		
	}

	
}
