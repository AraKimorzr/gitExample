package ch14;

import java.util.LinkedList;

//큐 구조 : FIFO(First In First Out)
//입력 : offer, 출력 : poll

public class LinkedExam {
	public static void main(String[] args) {
		String[] fruits = {"사과","배","포도","딸기","수박"};
		LinkedList list = new LinkedList();
		for(String str : fruits) {
			list.offer(str);//큐 구조에 자료 입력
		}
		
		String str = "";
		while((str=(String)list.poll()) !=null) {
			System.out.println(str+" 삭제되었습니다.");
		}
	}

}
