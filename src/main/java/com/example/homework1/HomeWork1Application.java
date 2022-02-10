package com.example.homework1;

import com.example.homework1.service.MusicTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HomeWork1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(HomeWork1Application.class, args);
        MusicTools musicTools = context.getBean(MusicTools.class);
        musicTools.playMusic();
        musicTools.stopMusic();
    }

}
