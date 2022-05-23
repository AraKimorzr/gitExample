package ch03;

public class BitEx {
	public static void main(String[] args) {
		//비트연산자( |(or), &(and), ^(XOR))
		System.out.println( 3 | 5); //or연산 , 0011 | 0101 => 0111(7)
		System.out.println( 3 & 5); //and연산 , 0011 & 0101 => 0001(1)
		System.out.println( 3 ^ 5); //XOR연산 , 0011 ^ 0101 => 0110(6)
	}

}
