import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest_1 {
	
	public void GetResponse200() {
		
		
	
	    @Test
		Response response=RestAssured.get("https://api.restful-api.dev/objects");
		
		System.out.println("Response : " + response.asPrettyString());
		
		//Assertion
		
		System.out.println("API RESPONSE CODE = " + response.getStatusCode());
		
		System.out.println("id are " + response.jsonPath().get("id") );
		
		System.out.println("name value are : " + response.jsonPath().get("name"));
		
		System.out.println("data value are : " + response.jsonPath().get("data.price"));
		
	}
	
	
	
	

	
		
		

	}


