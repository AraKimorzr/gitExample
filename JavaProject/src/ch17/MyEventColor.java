package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyEventColor extends JFrame {
	
	public MyEventColor() {
		setTitle("BorderLayout 응용");
		setSize(300,200);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		//Button b5 = new Button("center");
		
		add(b1, "East");
		add(b2, "West");
		add(b3, "South");
		add(b4, "North");
		//add(b5, "Center");
		
		b1.addActionListener(new MyColorAction(this, Color.green));
		b2.addActionListener(new MyColorAction(this, Color.yellow));
		b3.addActionListener(new MyColorAction(this, Color.blue));
		b4.addActionListener(new MyColorAction(this, Color.red));
		
		
		//윈도우창 닫기
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				System.exit(0);
				}
		});
	}//end MyEventColor()
	
	public static void main(String[] args) {
		new MyEventColor();
	}
	
}
