package me.soomin.springbootstartered;

import me.soomin.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootstarteredApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(SpringbootstarteredApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

//    @Bean
//    public Holoman holoman1(){
//        Holoman holoman = new Holoman();
//        holoman.setName("soomin");
//        holoman.setHowLong(60);
//        return holoman;
//    }

}
