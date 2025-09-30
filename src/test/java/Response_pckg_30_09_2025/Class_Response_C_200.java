package Response_pckg_30_09_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Class_Response_C_200 {
	
	@Test
	public void GetResponse200Code() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response : " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE =  " + response.getStatusCode());
		
		System.out.println("id are : "  + response.jsonPath().get("id"));
		
		System.out.println("name value are :  "  + response.jsonPath().get("name"));
		
		System.out.println("data value are : "  + response.jsonPath().get("data.price"));
		
		
	}

}
