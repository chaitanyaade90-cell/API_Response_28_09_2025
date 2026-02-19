package Inheritance_19_02_2026;

class Deposit
{
	
	public void Divedend() {
		
		System.out.println("My Bank give 7% intrest");
	}
}

class JointAccount extends Deposit{
	
	public void NetProfit() {
		
		System.out.println("My Bank name is SBI");
		
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JointAccount j1 = new JointAccount();
		
		j1.Divedend();
		j1.NetProfit();

	}

}
