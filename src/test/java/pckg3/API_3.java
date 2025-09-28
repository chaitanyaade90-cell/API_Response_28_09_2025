package pckg3;

import java.util.List;

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
		
		
		System.out.println(response.jsonPath().getString("id"));
		
		//System.out.println(response.jsonPath().getString("name"));
		System.out.println("*******");
		List<String> names=response.jsonPath().getList("name");
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			
		}
		System.out.println("*******");
		System.out.println(response.jsonPath().getString("data.color"));
		
	}

}
