package Inherit_30_12_2025;

class Bank
{
	
	public void DividendFund() {
		System.out.println("My bank intrest rate is 4%");
	}
}

class postoffice extends Bank
{
	
	public void Rateofintrest() {
		System.out.println("My saving account");
	}
}

public class Inheri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		postoffice po = new postoffice();
		po.DividendFund();
		po.Rateofintrest();

	}

}
