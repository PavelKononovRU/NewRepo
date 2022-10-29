package app.config;

import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("app");

        AnimalsCage animalsCage = context.getBean(AnimalsCage.class);

        System.out.println(animalsCage.whatAnimalSay());
    }
}
