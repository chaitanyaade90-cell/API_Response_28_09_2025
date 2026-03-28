package MultipleWindows_28_03_2026;

import javax.swing.JFrame;

public class Multiplewindows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame window1 = new JFrame("Window 1");
		
		window1.setSize(300,200);
		window1.setVisible(true);
		
		//Second Window
		
		JFrame window2 = new JFrame("Window 2");
		
		window2.setSize(300, 200);
		
		window2.setLocation(350,0);
		window2.setVisible(true);

	}

}
