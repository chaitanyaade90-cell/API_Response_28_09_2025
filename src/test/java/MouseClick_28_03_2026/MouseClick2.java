package MouseClick_28_03_2026;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseClick2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot();
		
		robot.mouseMove(500, 300);
		
		robot.delay(1000);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

	}

}
