package MultipleWindows_28_03_2026;

import javax.swing.JFrame;

public class MultipleWondows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame windows1 = new JFrame("Window 1");
		
		windows1.setSize(100, 200);
		windows1.setVisible(true);
		
		// SecondWindows
		
		JFrame windows2 = new JFrame("Window 2");
		
		windows2.setSize(300,200);
		
		windows2.setLocation(400,0);
		windows1.setVisible(true);

	}

}
