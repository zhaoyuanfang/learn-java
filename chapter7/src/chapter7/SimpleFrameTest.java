package chapter7;
import java.awt.*;
import javax.swing.*;


/**
 * @version 201812.09
 * @author Yuanfang
 *
 */
public class SimpleFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SimpleFrame frame = new SimpleFrame();// TODO Auto-generated method stub
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});
	}
}
class SimpleFrame extends JFrame
{
	public SimpleFrame() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);// TODO Auto-generated constructor stub
	}
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGTH = 200;
}
