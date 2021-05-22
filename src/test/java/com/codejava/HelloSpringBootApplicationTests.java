package com.codejava;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootApplicationTests {

    @Autowired
    private WebController webController;
    @Test
    void contextLoads() {
        Assertions.assertThat(webController).isNotNull();
    }

}
