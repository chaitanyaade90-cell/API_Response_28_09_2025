package pckg_29_09_2025;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Response_2 {
	
	@Test
	public void Get200() {
		
		Response response= RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assure
		
		System.out.println("API RESPONSE CODE= " + response.getStatusCode());
		
		List<String>names=response.jsonPath().getList("name");
		
		List<String>id=response.jsonPath().getList("id");
		
		for (int i = 0; i <names.size(); i++) {
			
			
		}
	}

}
