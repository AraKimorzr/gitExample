package ch08;

//싱글톤 기법
public class MyManager {
	private int score;//10 100
	
	//싱글톤 처리된 생성자는
	
	private MyManager(int score) {
		this.score=score;
	}
	
	//private static 클래스이름 참조변수;
	private static MyManager mgr;
	
	//public static 클래스이름 메소드이름()
	public static MyManager getInstance() {
		if(mgr==null) {//처음 MyManager가 객체화될 때의 경우
			mgr=new MyManager(10);
		}
		return mgr; //한번 이상 객체 생성이 되었다면(즉, 주소값이 있으면) 그값을 리턴
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}

}
