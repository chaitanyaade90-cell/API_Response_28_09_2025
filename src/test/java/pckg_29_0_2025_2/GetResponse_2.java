package pckg_29_0_2025_2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse_2 {
	
	
	@Test
	public void GetResponse_2() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Asser
		
		System.out.println("API RESONSE CODE= "  + response.getStatusCode());
		
		
		
	}
	
	
	
	}
