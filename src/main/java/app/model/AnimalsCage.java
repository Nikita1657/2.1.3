package app.model;

import app.model.Animal;
import app.model.Timer;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier( "dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        animal.makeSound();
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println(timer.getTime()+"const");
        System.out.println("________________________");
    }

    public Timer getTimer() {
    return timer; }
}