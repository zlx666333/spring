import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.bean.Person;
import zlx.config.MainConfig;
import zlx.config.MainConfig2;

public class IOCTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }
    }
    @Test
    public void test02(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig2.class);
        Person bean = mainConfig.getBean(Person.class);
        System.out.println(bean);
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }

    }

    @Test
    public void Score(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("创建容器");
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        for(String s:beanDefinitionNames){
            System.out.println(s);
        }
        System.out.println("--------------");
        Person bean = mainConfig.getBean(Person.class);
        for(String s:beanDefinitionNames){
            System.out.println(s);
        }

    }
    @Test
    public void lazy(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }
        Person bean = mainConfig.getBean(Person.class);
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }
    }

    public void test(){
        System.out.println("zlxtest赵立信");
        System.out.println("zlx");
    }




















}
