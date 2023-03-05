package com.sm;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Properties;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class).properties(this.getProperties());
    }

    Properties getProperties() {
        Properties properties = new Properties();
        properties.put("spring.config.location", "classpath:application.properties,file:C:\\opt\\config\\kazim.yml");
        return properties;
    }

}
