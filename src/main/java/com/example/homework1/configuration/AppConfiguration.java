package com.example.homework1.configuration;

import com.example.homework1.service.AppleMusic;
import com.example.homework1.service.MusicTools;
import com.example.homework1.service.YouTubeMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;


@Configuration
public class AppConfiguration {

    @PostConstruct
    public void sayHello() {
        System.out.println("Let`s Start");
    }

    @Bean
    public MusicTools youTubeMusicConfiguration(){
        return new YouTubeMusic();
    }

    @Bean
    @Primary
    public  MusicTools appleMusicConfiguration(){

        return new AppleMusic();
    }
}

