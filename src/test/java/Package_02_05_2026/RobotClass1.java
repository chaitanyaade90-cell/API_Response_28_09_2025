package Package_02_05_2026;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClass1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println("Enter pressed");

	}

}
