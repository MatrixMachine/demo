package com.example.demo.plugin;

import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author kermit.mo
 */
@Service
public class OrangeCat extends Cat{
    @Override
    public void shout() {
        System.out.println("大橘为重");
    }

    @Override
    public boolean supports(CatContext delimiter) {
        String birthplace = delimiter.getBirthplace();
        String color = delimiter.getColor();
        if (Objects.equals(birthplace, "china")){
            return true;
        }
        if (Objects.equals(color, "orange")){
            return true;
        }
        return false;
    }
}
