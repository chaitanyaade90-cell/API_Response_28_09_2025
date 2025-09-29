package API_Response;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APICode200_2 {
	
	@Test
	public void Response200() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE= " + response.statusCode());
		
		System.out.println("ids are " + response.jsonPath().get("id"));
		
		System.out.println("name values are: " + response.jsonPath().get("name"));
	}

}
