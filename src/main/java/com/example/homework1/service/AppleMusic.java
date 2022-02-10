package com.example.homework1.service;

public class AppleMusic implements MusicTools{
    @Override
    public void playMusic() {
        System.out.println("play music in apple");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop music in apple");
    }
}
