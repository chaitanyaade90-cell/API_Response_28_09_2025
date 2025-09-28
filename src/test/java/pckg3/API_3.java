package pckg3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_3 {
	
	@Test
	public void ResponseCode200() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Reponse:"  + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONCE CODE= " + response.statusCode());
	}

}
