package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        MediaPlayer mediaPlayer = new AudioPlayer();

        mediaPlayer.play("mp3", "song.mp3");
        mediaPlayer.play("mp4", "song.mp4");
        mediaPlayer.play("vlc", "song.vlc");
    }
}