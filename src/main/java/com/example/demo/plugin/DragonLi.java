package com.example.demo.plugin;

import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author kermit.mo
 */
@Service
public class DragonLi extends Cat{
    @Override
    public void shout() {
        System.out.println("养猫就养狸花猫，狸花猫是真的好");
    }

    @Override
    public boolean supports(CatContext delimiter) {
        return Objects.equals(delimiter.getBirthplace(), "china");
    }
}
