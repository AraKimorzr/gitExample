package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		//Set은 중복값을 허용하지 않는다, 순서 없음
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");
		
		//출력방식
		//1)
		System.out.println(hs);
		System.out.println("------------");
		
		//2)
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("------------");
		
		//3)
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {//다음 요소가 있으면 true
			System.out.println(it.next());//다음 요소가 있으면
		}
	}

}
