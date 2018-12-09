package chapter6;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "quit program?");
		System.exit(0);
	}
}

class TalkingClock
{
	private int interval;
	private boolean beep;
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;// TODO Auto-generated constructor stub
	}
	
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	public class TimerPrinter implements ActionListener
	{
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println(("at this tone, thie time is " + now));
			if(beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}
