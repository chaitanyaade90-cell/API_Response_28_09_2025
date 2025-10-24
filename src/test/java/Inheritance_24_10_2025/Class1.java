package Inheritance_24_10_2025;

class AQ
{
	int aq=800;

	public void inheritance() {

		System.out.println(aq);
	}
}

class PQ extends AQ
{
	int pq = 300;

	public void inheritance2() {

		System.out.println(pq);
	}

}

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AQ obj = new AQ();
		obj.inheritance();

		System.out.println("*************");

		PQ obj2=new PQ();
		obj2.inheritance2();

	}

}
