package app.model;

import app.model.Animal;
import app.model.Timer;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//помечает класс в качестве кандидата для создания Spring бина
public class AnimalsCage {

    @Autowired//Аннотация позволяет автоматически установить значение поля
    @Qualifier("dog")//уточнитель, что устанавливать
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
