package Custom_Exception_alert_02_01_2026;

class AgeException extends Exception{
	
	AgeException(String msg) {
		super(msg);
			
	}
	
}

public class Custommec1 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		int age = 15;
		if(age < 18) {
			
			throw new AgeException("below 18 age");
		}

	 
	}

	
}
