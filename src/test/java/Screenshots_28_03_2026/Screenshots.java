package Screenshots_28_03_2026;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.imageio.ImageIO;

public class Screenshots {

	private static final String Screenshot = null;

	public static <BufferedImage> void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot ();
		
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		
		BufferedImage image = (BufferedImage) robot.createMultiResolutionScreenCapture(screenRect);
        
		
	}

}
