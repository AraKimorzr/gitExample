package ch16;

public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}
	
	//기본생성자는 다른 생성자를 만들었을 경우 습관적으로 사용하던 안하던 만들어 두는게 좋다.
	public void MusicPlayer() {
		
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: musicBox.playMusicA(); break;
		case 2: musicBox.playMusicB(); break;
		case 3: musicBox.playMusicC(); break;
		}
	}

}
