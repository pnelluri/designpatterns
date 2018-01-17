package Structural.Adapter;

public class AdapterTestClass {
public static void main(String[] args) {
	MediaPlayerAdapter ad = new MediaPlayerAdapter();
	ad.play("mp3", "My Song");
	ad.play("vlc", "My Song");
	ad.play("mp4", "My Song");
}
}
