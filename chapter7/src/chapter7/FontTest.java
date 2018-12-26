package chapter7;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * @version 20181210
 * @author Administrator
 *
 */
public class FontTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				FontFrame fontFrame = new FontFrame();
				fontFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// TODO Auto-generated method stub
				fontFrame.setVisible(true);

			}
		});
	}
}

class FontFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public FontFrame() {
		setTitle("FontTest");// TODO Auto-generated constructor stub
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		FontComponent fontComponent = new FontComponent();
		add(fontComponent);
	}
}

class FontComponent extends JComponent {
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D graphics2d = (Graphics2D) g;
		String message = "Hello world";
		Font font = new Font("Serif", Font.BOLD, 36);
		graphics2d.setFont(font);
		FontRenderContext context = graphics2d.getFontRenderContext();
		Rectangle2D bounds = font.getStringBounds(message, context);
		double x = (getWidth() - bounds.getWidth()) / 2;
		double y = (getHeight() - bounds.getHeight()) / 2;
		double ascent = -bounds.getY();
		double baseY = y + ascent;
		graphics2d.drawString(message, (int) x, (int) baseY);
		graphics2d.setPaint(Color.LIGHT_GRAY);
		graphics2d.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));
		Rectangle2D rectangle2d = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
	}
}