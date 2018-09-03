package com.webinar.config;

import com.webinar.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public TestBean getTestBean(){
        TestBean testBean = new TestBean();
        testBean.setName("Artem");
        return testBean;
    }

}
