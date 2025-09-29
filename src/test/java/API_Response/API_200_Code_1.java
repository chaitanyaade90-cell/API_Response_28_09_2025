package API_Response;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class API_200_Code_1 {
	/*
	 * 
	 * 
	 * 
	 */
	// LAN id= CA262
	// Date-29/09/2025
	//Response Code

	@Test
	public void GetResponse_200() {
		Response response= RestAssured.get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
		System.out.println("Response: " + response.asPrettyString());

		//Assertion

		System.out.println("API RESPONSE CODE= "+ response.getStatusCode());

		System.out.println("ids are : " + response.jsonPath().get("id"));
		System.out.println("price values are: " + response.jsonPath().get("data.price"));

		System.out.println("name values are : " + response.jsonPath().get("name"));

		List<String> allNames=response.jsonPath().getList("name");
		
		System.out.println("*****************************************");
		for (int i = 0; i < allNames.size(); i++) {
			if(allNames.get(i).startsWith("Apple")) {
				System.out.println(allNames.get(i));
			}
		}
		/*
		System.out.println("Response: " + response.jsonPath());

		System.out.println("API RESPONSE CODE= " + response.xmlPath() );
		 */
	}

}
