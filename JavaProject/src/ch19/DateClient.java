package ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

//DataServer 실행 후 나중에 실행
public class DateClient {
	public static void main(String[] args) throws Exception {
		//new Socket("IP주소", 포트번호);
		//localhost(내 아이피) = 127.0.0.1
		Socket s = new Socket("localhost", 8000);//서버의 포트번호 8000번과 동일하게 셋팅
		//서버에서 accept() 하면 통신 가능 상태로 들어감
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 받음
		String res = input.readLine();//한줄씩 읽어서
		System.out.println(res);
		s.close();//소켓 닫기(연결 종료)
		System.exit(0);//프로그램 종료
	}

}
