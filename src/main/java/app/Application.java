package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalsCage bean = applicationContext.getBean(AnimalsCage.class);
        Timer beanT = applicationContext.getBean(Timer.class);
        Long time = beanT.getTime();
        Long timeSecond = beanT.getTime();
        for (int i = 0; i < 5 && time.equals(timeSecond); i++) {
            bean.whatAnimalSay();
            timeSecond = beanT.getTime();
        }
    }
}
