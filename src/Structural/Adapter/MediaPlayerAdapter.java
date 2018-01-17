package Structural.Adapter;

import javax.print.attribute.standard.Media;

public class MediaPlayerAdapter extends AdvanceMediaPlayer implements MediaPlayer{
	
	MediaPlayerAdapter(){
		
	}
	@Override
	public void play(String fileType, String fileName) {
		if(fileType.equals("mp3")) {
			System.out.println("Playing Mp3 Old");
		}
		else if(fileType.equals("vlc")){
			playVlc("vlc");
		}else if(fileType.equals("mp4")){
			playMp4("mp4");
		}
	}

}
