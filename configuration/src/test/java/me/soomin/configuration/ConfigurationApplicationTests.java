package me.soomin.configuration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
class ConfigurationApplicationTests {

    @Autowired
    private Environment environment;

    @Test
    void contextLoads() {
        Assertions.assertThat(environment.getProperty("soomin.name"))
                .isEqualTo("soo");
        System.out.println(environment.getProperty("soomin.age"));
    }

}
