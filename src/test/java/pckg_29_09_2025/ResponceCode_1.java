package pckg_29_09_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponceCode_1 {
	
	
	@Test
	public void GetResponceCode() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Respomse: " + response.asPrettyString());
		
		//Assure
		
		System.out.println("API RESPONSE CODE= " + response.getStatusCode());
		
		
	}

}
