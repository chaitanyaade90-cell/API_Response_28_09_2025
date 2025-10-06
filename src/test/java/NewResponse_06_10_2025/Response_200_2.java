package NewResponse_06_10_2025;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Response_200_2 {
	
	/*
	 * 
	 * 
	 */

	@Test
	public void GetResponse200() {

		Response response=RestAssured.get("https://api.restful-api.dev/objects");

		System.out.println("Response : " + response.asPrettyString());

		//Assertion

		System.out.println("API RESONSE CODE = " + response.statusCode());

		System.out.println("id are : " + response.jsonPath().get("id"));

		System.out.println("name value are : " + response.jsonPath().get("name"));

		System.out.println("data price : " + response.jsonPath().get("data.value"));
	}

}
