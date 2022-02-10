package com.example.homework1.service;

public class YouTubeMusic implements MusicTools{
    @Override
    public void playMusic() {
        System.out.println("play music in youtube");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop music in youtube");
    }
}
