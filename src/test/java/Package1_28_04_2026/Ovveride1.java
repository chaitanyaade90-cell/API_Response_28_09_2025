package Package1_28_04_2026;

class BaseTest
{
	
	public void openBrowser() {
		
		System.out.println("Open Chrome Browser");
	}
}

class TestCase extends BaseTest{
	
	void openBrowser2() {
		
		System.out.println("Open Edge Browser");
	}
}

public class Ovveride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCase t = new TestCase();
		
		t.openBrowser();
		t.openBrowser2();

	}

}
