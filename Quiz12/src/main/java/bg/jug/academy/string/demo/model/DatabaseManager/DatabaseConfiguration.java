/*
Create a DatabaseConfiguration class with a bean factory method that creates a bean
 of type bg.jug.academy.string.demo.model.DatabaseManager.

Note: Use fully qualified class names of annotations from Spring framework.
 */


package bg.jug.academy.string.demo.model.DatabaseManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {
    @Bean
    public bg.jug.academy.string.demo.model.DatabaseManager databaseManager() {
        return new bg.jug.academy.string.demo.model.DatabaseManager();
    }
}
