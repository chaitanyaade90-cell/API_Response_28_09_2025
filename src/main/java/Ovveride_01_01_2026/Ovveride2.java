package Ovveride_01_01_2026;

class RegressionTest
{
	
	public void Application() {
		
		System.out.println("I am a Manual Tester");
	}

	public void Software() {
		// TODO Auto-generated method stub
		
	}
}

class WhiteBoxTesting extends RegressionTest{
	
	@Override
	public void Software() {
		
		System.out.println("I am testing on Web Automation");
		
	}
	
}

public class Ovveride2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhiteBoxTesting wb = new WhiteBoxTesting();
		
		wb.Application();
		wb.Software();

	}

}
