package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//
@ComponentScan(basePackages = "app")//указывает где Spring искать классы, помеченные аннотацией @Component или его производной
public class AppConfig {
}
