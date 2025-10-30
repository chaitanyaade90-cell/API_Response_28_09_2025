package OverridingPackage_30_10_2025;

class Bank
{
	
	double rateofintrest()
	{
		return 0;		
		
	}
}
class ICICI extends Bank
{
	double rateofintrest()
	{
		return 10.5;
		
	}
	
	
}

class SBI extends Bank
{
	double rateofintrest()
	{
		return 11.5;
		
	}
}

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICI ic=new ICICI();
		System.out.println(ic.rateofintrest());
		

	}

}
