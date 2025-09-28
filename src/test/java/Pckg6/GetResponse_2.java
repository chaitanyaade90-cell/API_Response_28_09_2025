package Pckg6;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse_2 {
	
	@Test
	public void Get_Apir_response() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Response: " + response.asPrettyString());
		
		
		//Assure
		
		System.out.println("API RESOPNCE CODE= " + response.getStatusCode());
		
		
		
	}

}
