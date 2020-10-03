package me.soomin.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class NameRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private SoominProperties soominProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(hello);
        System.out.println(soominProperties.getName());
        System.out.println(soominProperties.getFullName());
        System.out.println("=======================");
    }
}
