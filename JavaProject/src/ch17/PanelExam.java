package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame {
	
	public PanelExam() {
		JPanel p = new JPanel();//패널 생성
		p.setBackground(Color.red);//패널의 배경색상 설정
		
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		
		p.add(button1);
		p.add(button6);
		
		//프레임의 north 영역에 패널을 추가
		add(p, BorderLayout.NORTH);
		
		//프레임 센터에 button2를 배치
		//add(button2, "center"); //center는 생략 가능
		add(button2);
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//닫기 버튼 시 완전 종료
				
	}
	
	public static void main(String[] args) {
		new PanelExam();
	}

}
