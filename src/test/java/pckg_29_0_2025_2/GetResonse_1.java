package pckg_29_0_2025_2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResonse_1 {
	
	
	@Test
	public void Get200ResponseCode() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE= " + response.getStatusCode());
		
		
	}

}
