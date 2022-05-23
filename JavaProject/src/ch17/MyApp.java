package ch17;

import java.applet.AudioClip;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyApp extends JApplet implements ActionListener {
	
	private AudioClip audio; 
	private JButton play, stop, loop;
	
	private Font font;
	private FontMetrics fm;
	private int x,y;
	private String message;
	private Dimension dim;
	
	@Override
	public void init() {
		//Audio
		setLayout(new FlowLayout());
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		setSize(300,400);
		setVisible(true);
		
		
		play = new JButton("play");
		stop = new JButton("stop");
		loop = new JButton("loop");
		
		add(play);
		add(stop);
		add(loop);
		
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
		
		
		//Font
		message = "YouTube 뮤직플레이어";
		font = new Font("돋움", font.BOLD , 20);
		fm = getFontMetrics(font);
		setSize(300,250);
		dim = getSize();
		System.out.println(dim.width);
		System.out.println(dim.height);
		x = (dim.width/2)-(fm.stringWidth(message)/2);
		y = (dim.height/2)-(fm.getDescent()/2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		}else if(btn == stop) {
			audio.stop();
		}else if(btn == loop) {
			audio.loop();
		}
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//Font
		g.setFont(font);
		g.drawString(message, x, y);
		
		//Graphics2D
		Graphics2D g2 = (Graphics2D)g;
		//뮤직바 만들기
		g2.setStroke(new BasicStroke(4));
		g.drawLine(45, 310, 260, 310);
		
		g.setColor(Color.lightGray);
		g.drawRect(45, 310, 90, 1);
		
		g.setColor(Color.lightGray);
		g.fillOval(125, 305, 13, 13);
		
		g.setColor(Color.black);
		int[] x1 = {70,70,55};
		int[] y1 = {340,360,350};
		g.fillPolygon(x1, y1, x1.length);
		
		g.setColor(Color.black);
		int[] x2 = {85,85,70};
		int[] y2 = {340,360,350};
		g.fillPolygon(x2, y2, x2.length);
		
		g.setColor(Color.black);
		g.fillRect(145, 340, 6, 22);
		
		g.setColor(Color.black);
		g.fillRect(155, 340, 6, 22);
		
		g.setColor(Color.black);
		int[] x3 = {220,220,235};
		int[] y3 = {340,360,350};
		g.fillPolygon(x3, y3, x3.length);
		
		g.setColor(Color.black);
		int[] x4 = {235,235,250};
		int[] y4 = {340,360,350};
		g.fillPolygon(x4, y4, x4.length);
		
		//유튜브 로고
		g.setColor(Color.red);
		g.fillRoundRect(85, 160, 130, 100, 30, 30);
		
		g.setColor(Color.white);
		int[] x = {135,135,170};
		int[] y = {195,225,210};
		g.fillPolygon(x, y, x.length);
				
	}
	
	public MyApp() {
		super();
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("Song Title"));
		c.add(new JTextField("dingdong",20));
		System.out.println();
		c.add(new JLabel("Artist"));
		c.add(new JTextField(20));
		
	}
	
	

}
