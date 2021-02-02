package ru.ryzhakov.springproject;

public class RockMusic implements Music{
    private String song;

    public RockMusic(){
        this.song = "Ramstein";
    }

    public String getSong() {
        return this.song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
