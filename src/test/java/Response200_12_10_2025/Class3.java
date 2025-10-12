package Response200_12_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Class3 {
	
	@Test
	public void get200() {
		
		Response response =RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response : " + response.asPrettyString());
		
		System.out.println("Response : " + response.statusCode());
		
		System.out.println("id are : " + response.jsonPath().get("id"));
		
		System.out.println("Name value are : " + response.jsonPath().get("name"));
		
		System.out.println("data value are : " + response.jsonPath().get("data.price"));
	}

}
