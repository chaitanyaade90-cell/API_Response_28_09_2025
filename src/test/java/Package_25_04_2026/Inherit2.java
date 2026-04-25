package Package_25_04_2026;

class DropDown
{
	public void Software() {
		
		System.out.println("India is a Biggest Trademark in Asia");
	}
}

class RadioButton extends DropDown{
	
	public void Textbox() {
		
		System.out.println("America world biggest economical country");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioButton rd = new RadioButton();
		
		rd.Software();
		rd.Textbox();

	}

}
