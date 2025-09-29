package pckg_29_09_2025_3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse_1 {
	
	
	@Test
	public void GetResponse() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE= " + response.getStatusCode());
	}

}
