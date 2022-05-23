package ch10;

public class StaticVarUse2 {
	public static void main(String[] args) {
		System.out.println(StaticVar2.total);//클래스 이름으로 접근(static멤버)
		
		StaticVar2 car1 = new StaticVar2("쏘나타");//인스턴스 생성
		System.out.println(car1);
		StaticVar2 car2 = new StaticVar2("모닝");//인스턴스 생성
		System.out.println(car2);
		StaticVar2 car3 = new StaticVar2("아반떼");//인스턴스 생성
		System.out.println(car3);
		System.out.println("=======================");
		
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);
		
		//static은 객체와는 별개로 공용의 주소에서 사용되어진다.
	}
	

}
