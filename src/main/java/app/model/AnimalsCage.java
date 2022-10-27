package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalCage")
public class AnimalsCage {

    @Qualifier("dog")
    @Autowired
    private Animal animal;

    @Autowired
    private Timer timer;

    public boolean whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
        return false;
    }
    public Timer getTimer() {
       return timer;
    }

}
