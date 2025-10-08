package Pckg_08_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse200_3 {
	
	@Test
	public void ResponseCode200() {
		
		Response response= RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		
		System.out.println("Response : " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("Response : " + response.statusCode());
		
		System.out.println("Id are : " + response.jsonPath().get("Id are"));
		
		System.out.println(" name value are : " + response.jsonPath().get("name"));
		
		System.out.println("data value are :  "  + response.jsonPath().get("data.price"));
		
		
		
	}

}
