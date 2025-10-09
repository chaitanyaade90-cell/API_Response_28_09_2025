package Pckg_Inheritance_09_10_2025;

class I
{
	
   int i=200;
   
   void inherit() {
	   
	   System.out.println(i);
   }
	   
	   
   }

class J extends I

{ 
	
	int j=300;
	
	void inherit2() {
		
		System.out.println(j);
	}
}
	




public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I obj=new I();
		
		obj.inherit();
		
		System.out.println("**********");
		
		
		J obj2=new J();
		
		obj2.inherit2();
		
		
		
		

	}

}
