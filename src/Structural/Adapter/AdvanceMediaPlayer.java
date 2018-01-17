package Structural.Adapter;

public class AdvanceMediaPlayer implements AdvancedMedia {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC");
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing MP4");
		
	}

}
