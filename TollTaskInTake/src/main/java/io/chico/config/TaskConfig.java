package io.chico.config;

import io.chico.TaskProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Francisco Almeida
 */
@Configuration
public class TaskConfig {

    @Bean
    public TaskProcessor taskProcessor() {
        return new TaskProcessor();
    }

}
