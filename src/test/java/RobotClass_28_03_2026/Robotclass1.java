package RobotClass_28_03_2026;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robotclass1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot();
		
		robot.delay(2000); // wait 2 sec
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);

	}

}
