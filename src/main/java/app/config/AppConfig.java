package app.config;

import app.model.AnimalsCage;
import app.model.Cat;
import app.model.Dog;
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

        Cat cat = (Cat) context.getBean("cat");

        Dog dog = (Dog) context.getBean("dog");

        System.out.println(animalsCage.whatAnimalSay());
        System.out.println(cat);
        System.out.println(dog);
    }
}
