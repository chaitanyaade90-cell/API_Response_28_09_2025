package ApiResponse_5;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse_A {
	
	@Test
	public void GetresponseA() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE= " + response.statusCode());
		
		System.out.println("ids are " + response.jsonPath().get("id"));
		
		System.out.println("name are " + response.jsonPath().get("name"));
		
		System.out.println("price values are " + response.jsonPath().get("data.price"));
	}

}
