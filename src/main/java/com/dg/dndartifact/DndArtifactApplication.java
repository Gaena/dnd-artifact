package com.dg.dndartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;

@SpringBootApplication(exclude = HypermediaAutoConfiguration.class)
public class DndArtifactApplication {

    public static void main(String[] args) {
        SpringApplication.run(DndArtifactApplication.class, args);
    }


}
