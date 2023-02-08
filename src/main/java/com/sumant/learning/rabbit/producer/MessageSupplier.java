package com.sumant.learning.rabbit.producer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;
import java.util.function.Supplier;

@Configuration
@Slf4j
public class MessageSupplier {

    @Bean
    public Supplier<String> messageGenerator(){

        return () -> {
            UUID uuid = UUID.randomUUID();
            log.info("Generating message for UUID: " + uuid);
            return "Hello from Id: " + uuid;
        };

    }

}
