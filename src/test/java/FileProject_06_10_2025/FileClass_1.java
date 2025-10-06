package FileProject_06_10_2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import new_concept_properties.properties_3;


public class FileClass_1 {
	
	public class properties_3 {

		public void main(String[] args) throws FileNotFoundException {
			
			//File path
			
			
			File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
			FileInputStream fis=new FileInputStream(f);
			properties_3 prop=new properties_3();
			//load files
			prop.load(fis);
			
			

		}

		private void load(FileInputStream fis) {
			// TODO Auto-generated method stub
			
		}

	}


}
