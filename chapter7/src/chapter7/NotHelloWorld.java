package chapter7;
import java.awt.*;
import javax.swing.*;

public class NotHelloWorld {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				NotHelloWorldFrame frame = new NotHelloWorldFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				// TODO Auto-generated method stub
				
			}
		});
	}
}
class NotHelloWorldFrame extends JFrame
{
	public NotHelloWorldFrame() {
		setTitle("NotHelloWorld");// TODO Auto-generated constructor stub
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		NotHelloWorldComponent component = new NotHelloWorldComponent();
		add(component);
	}
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
}

class NotHelloWorldComponent extends JComponent
{
	public static int MESSAGE_X = 75;
	public static int MESSAGE_Y = 100;
	public void paintComponent(Graphics graphics) {
		graphics.drawString("Not a hello world program", MESSAGE_X, MESSAGE_Y);
	}
}
