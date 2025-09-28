package pckg5;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Git_2 {
	
	@Test
	public void GitLogin2() {
		
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response: " + response.asPrettyString());
		
		//Assure
		
		System.out.println("API RESPONSE CODE= "+ response.getStatusCode());

	}

}
