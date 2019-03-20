package com.rayson.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean(name = "testSgtPeppers")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

}
