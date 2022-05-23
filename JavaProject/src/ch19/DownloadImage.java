package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA1MTlfMjI1%2FMDAxNjUyOTMwODgyMjY0.oZ1atuKB8AE0dnDumo837f9rXoFbcAS1XkNZB2KfXrcg.mQa6Le2uBeAS59_eV74IyPokKhd8EV6P5ItFxvecjXkg.JPEG.sdy8657%2FIMG_6355.JPG&type=sc960_832";
		
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website);//url생성
		byte[] buffer = new byte[2048];//버퍼용 바이트 배열[2mb]
		// 파일로 저장 <== 프로그램 <== 서버의 이미지 파일
		
		//try ~ with문 (java1.7부터 도입)
		//문장구조: try(리소스 선언부) { } catch(Exception e) { }
		//사용이유: finally가 없어도 리소스를 자동으로 종료시김
		try(InputStream in = url.openStream(); OutputStream out = new FileOutputStream("c:\\Test\\Test.jpg")) {
			int length = 0;//읽은 바이트수를 리턴
			//읽은 바이트수 = 스트림.read(버퍼)
			//더이상 읽을 내용이 없으면 -1
			while((length=in.read(buffer)) != -1) {
				System.out.println(length+"바이트 읽음.");
				//출력스트림.write(버퍼,시작인덱스,길이값)
				out.write(buffer,0,length);
			}
			System.out.println("다운로드가 완료되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
		          
	}

}
