import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());

        Cat vasya =
                (Cat) applicationContext.getBean("cat");
        Cat jora =
                (Cat) applicationContext.getBean("cat");
//        System.out.println(vasya.getVoice());

        System.out.println("Бины HelloWorld равны? - " + (bean==bean1));
        System.out.println("Бины Cat равны? - " + (vasya==jora));
    }
}