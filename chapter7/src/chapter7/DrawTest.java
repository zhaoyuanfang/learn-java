package chapter7;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class DrawTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				DrawFrame frame = new DrawFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// TODO Auto-generated method stub
				frame.setVisible(true);
				
			}
		});// TODO Auto-generated constructor stub
	}
}

class DrawFrame extends JFrame
{
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 400;
	public DrawFrame() {
		setTitle("DrawTest");// TODO Auto-generated constructor stub
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		DrawComponent component = new DrawComponent();
		add(component);
	}
}

class DrawComponent extends JComponent
{
	public void paintComponent(Graphics graphics) {
		Graphics2D graphics2d = (Graphics2D) graphics;
		
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		Rectangle2D rectangle2d = new Rectangle2D.Double();
		graphics2d.draw(rectangle2d);
		
		Ellipse2D ellipse2d = new Ellipse2D.Double();
		ellipse2d.setFrame(rectangle2d);
		graphics2d.draw(ellipse2d);
		
		graphics2d.draw((new Line2D.Double(leftX, topY, width + leftX, height + topY)));
		
		double centerX = rectangle2d.getCenterX();
		double centerY = rectangle2d.getCenterY();
		double radius = 150;
		
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY,centerX+radius,centerY+radius);;
		graphics2d.draw(circle);
	}
}
