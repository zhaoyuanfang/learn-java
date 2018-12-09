package chapter7;
import java.awt.*;
import javax.swing.*;
/**
 * @version 20181209
 * @author Yuanfang
 *
 */
public class SizeedFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SizedFrame frame = new SizedFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
class SizedFrame extends JFrame
{
	public SizedFrame() {
		Toolkit kToolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kToolkit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		
		//Image image =kToolkit.getImage("icon.gif");
		//setIconImage(image);
		setTitle("SizedFrame");
		// TODO Auto-generated constructor stub
	}
}
