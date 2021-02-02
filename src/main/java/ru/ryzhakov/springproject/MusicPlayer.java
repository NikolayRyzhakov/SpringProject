package ru.ryzhakov.springproject;

public class MusicPlayer {
    private Music music;

    public void playMusic(){
        System.out.println("Playing music: " + music);
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
