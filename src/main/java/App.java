import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld)  applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");

        Cat beanCAt2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean == bean2);
        System.out.println(bean.equals(bean2));

        System.out.println(beanCat == beanCAt2);
        System.out.println(beanCat.equals(beanCAt2));

    }
}