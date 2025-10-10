package PckgInherit_10_10_2025;


class Q
{
	
	int q=2000;
	
	void inherit() {
		
		System.out.println(q);
	}
}

class R extends Q
{
	
	int r=100;
	
	void inherit2() {
		
		System.out.println(r);
	}
}

public class Inherit_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q obj=new R();
		obj.inherit();
		
		System.out.println("******");
		
		R obj1=new R();
		
		obj1.inherit2();
		

	}

}
