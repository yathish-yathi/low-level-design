package org.example;

public class AudioPlayer implements MediaPlayer {

    AudioAdapter audioAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("Playing "+fileName+" using MP3 Adapter");
        }else {
            audioAdapter = new AudioAdapter();
            audioAdapter.play(audioType, fileName);
        }
    }
}
