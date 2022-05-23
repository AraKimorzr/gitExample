package ch14;

import java.util.Stack;

//Stack : 마지막으로 들어온 값이 첫번째로 출력되는 구조

public class StackExam {
	public static void main(String[] args) {
		String[] nation = {"한국","일본","중국","미국","영국"};
		Stack<String> s = new Stack<>();
		for(String str : nation) {
			s.push(str);//스택에 값을 입력
		}
		
		for(int i=0; i<nation.length; i++) {
			System.out.println(s.pop());
		}
	}

}
