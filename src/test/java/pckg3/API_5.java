package pckg3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_5 {
	/*
	 * Author: CA262
	 * Testcase: validate phone names in API
	 * Date-28th Sept-2025
	 * Description: this Test script validates phone names in API response
	 */
	@Test
	public void Validate_Phone_Names_TestScript() throws Exception {
		
		File f= new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\config.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		
		Response response=RestAssured.get(prop.getProperty("endpoint.url"));		
		System.out.println("API RESPONCE CODE= " + response.statusCode());

		List<String> names=response.jsonPath().getList("name");
		
		for(int i=0;i<names.size();i++) {
			if(names.get(i).startsWith("A")) {
				System.out.println(names.get(i));
			}else {
				Assert.fail("phone name contains "+names.get(i));
			}
		}
		
	}

}
