package org.example;

public class AudioAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
    @Override
     public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.MP4(fileName);
        } else if (audioType.equals("vlc")) {
            advancedMediaPlayer.VLC(fileName);
        }else {
            System.out.println("unsupported file");
        }
    }
}
