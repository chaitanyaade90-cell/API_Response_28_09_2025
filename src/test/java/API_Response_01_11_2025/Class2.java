package API_Response_01_11_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Class2 {
	
	@Test
	public void Get200() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Resopnse : " + response.asPrettyString());
		
		System.out.println("Response : " + response.statusCode());
		
		System.out.println("id are : " + response.jsonPath().get("id")) ;
		
		System.out.println("name value are  " + response.jsonPath().get("name"));
		
		System.out.println("data value are " + response.jsonPath().get("data.price"));
		
	}

}
