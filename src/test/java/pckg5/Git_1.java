package pckg5;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Git_1 {
	
	@Test
	public void LoginGit() {
		
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response:" + response.asPrettyString());
		
		//Assured
		
		System.out.println("API RESPONSE CODE=" + response.getStatusCode());

	}

}
