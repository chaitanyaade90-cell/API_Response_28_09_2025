package ApiResponse_26_11_2025;

import org.openqa.selenium.devtools.v119.network.model.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APi2 {
	
	@Test
	public void Get200Code() {
		
		io.restassured.response.Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
	     
		System.out.println("Response : " + response.asPrettyString());
		
		System.out.println("Response : " + response.statusCode());
		
		System.out.println("id are : " + response.jsonPath().get("id"));
		
		System.out.println("name value are : " + response.jsonPath().get("name"));
		
		System.out.println("data value are : " + response.jsonPath().get("data.price"));
	
	}
	

	
	}


