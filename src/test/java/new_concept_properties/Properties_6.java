package new_concept_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Properties_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//File path
		
		File f=new File("C:ChaitanyaAdeeclipse_workspaceAPI_Response_28_09_2025srctestjavanew_conceptproperties");
        FileInputStream fis=new FileInputStream(f);
        
        Properties prop=new Properties();
        
        //load files
        
        prop.load(fis);
        
        // print values
        
        System.out.println(prop.getProperty("end pointurl_api_url"));
        
        
	}

}
