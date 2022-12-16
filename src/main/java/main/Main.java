package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.HelloService;

public class Main {
    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            HelloService service =c.getBean(HelloService.class);
          String message= service.hello("Alex");

            System.out.println("Result is "+message);
        }
    }
}
