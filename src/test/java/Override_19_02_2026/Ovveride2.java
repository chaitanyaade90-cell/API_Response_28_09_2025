package Override_19_02_2026;

class SyncApp
{
	
	public void EnglishClass() {
		
		System.out.println("My course is English");
	}

	public void Exceler() {
		// TODO Auto-generated method stub
		
	}
}

class KPIs extends SyncApp{
	
	@Override
	
	public void Exceler() {
		
		System.out.println("My course is Maths");
	}
	
}

public class Ovveride2 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
	KPIs kp = new KPIs();
	
	kp.EnglishClass();
	kp.Exceler();

	}

}
