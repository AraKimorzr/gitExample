package ch03;

public class CastEx2 {
	public static void main(String[] args) {
		int a=500;
		float b=200.2f;
		int c=127;
		
		double d = a;//자동형변환(확대);작은 곳에서 큰 곳으로 변환
		System.out.println("int a => double : " + d);
		
		int e = (int)b;//명시적형변환(축소);큰 곳에서 작은 곳으로 변환
		System.out.println("float b => int : " + e);
		
		byte f = (byte)c; // byte값은 -128~127의 값까지의 범위만 해당(ex.128=>x)
		System.out.println("int c => byte : " + f);
	}

}
