package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameExam {
	public static void main(String[] args) {
		Frame f=new Frame("프레임 제목");//윈도우창과 같은 화면을 띄우는 클래스
		f.setSize(200, 300);//프레임의 사이즈 설정
		f.setVisible(true);//프레임을 화면에 표시
		
		//화면닫기기능 추가
		//WindowListener()는 interface이기 때문에 모든 추상메소드를 오버라이딩해야한다.
//		f.addWindowListener(new WindowListener() {//익명내부클래스
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램을 종료시킴
//				//정상종료 : 0, 비정상종료 : -1
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		//Adapter를 쓰면 코드가 간략해진다.
		//WindowAdapter는 abstract 클래스이기 때문에 필요한 추상메소드만 오버라이딩해도된다.
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
