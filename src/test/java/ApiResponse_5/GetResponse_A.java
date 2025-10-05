package ApiResponse_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse_A {
	
	@Test
	public void GetresponseA() throws Exception {
		File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		
		
		System.out.println(prop.get("endpoing1_api_url"));
		String url=(String) prop.get("endpoing1_api_url");	
		Response response=RestAssured.get(url);		
		System.out.println("Response: " + response.asPrettyString());
		//Assertion
		
		System.out.println("API RESPONSE CODE= " + response.statusCode());
		
		System.out.println("ids are " + response.jsonPath().get("id"));
		
		System.out.println("name are " + response.jsonPath().get("name"));
		
		System.out.println("price values are " + response.jsonPath().get("data.price"));
		
		
	}

}
