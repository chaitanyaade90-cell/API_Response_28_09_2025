package NewResponse_06_10_2025;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Response_7 {
	
	public void GetResponse200() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects/7");
		
		System.out.println("Response : " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE : " + response.statusCode());
		
		System.out.println("id are : " + response.jsonPath().get("id"));
		
		System.out.println("");
	}

}
