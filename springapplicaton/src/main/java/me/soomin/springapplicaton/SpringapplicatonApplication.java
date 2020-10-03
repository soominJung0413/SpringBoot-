package me.soomin.springapplicaton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringapplicatonApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringapplicatonApplication.class, args); 동일
        SpringApplication application = new SpringApplication(SpringapplicatonApplication.class);
        application.setWebApplicationType(WebApplicationType.REACTIVE);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.addListeners(new SampleListener());
        application.run(args);
    }

}
