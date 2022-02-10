package com.example.homework1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.example.homework1.Java14.Switch.isLightingOn;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HomeWork1ApplicationTests {

    @Test
    void verifyLightPosition() {
        assertThat(isLightingOn("On")).isEqualTo("Light on");
        assertThat(isLightingOn("Off")).isEqualTo("Light off");
    }

    @Test
    void nullPointerException(){
        List<String> names = null;
        System.out.println(names.size());
    }

}
