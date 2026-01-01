package Log4j_package_31_12_2025;

import java.util.logging.LogManager;

import org.testng.annotations.Test;

import io.opentelemetry.api.logs.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j_1 {
	
	@Test
	public void loginTest() {
		
		Log.info("Login Test Started");
		
		Log.info("Login Test Executed Succesfully");
	}
	
	@Test
	public void logoutTest() {
		
		Log.info("Logout Test Started");
		
		Log.info("Logout Test Executed Succesfully");
		
	}

			

	}


