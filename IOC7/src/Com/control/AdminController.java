package Com.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Com.Config.AppConfig;
import Com.Entity.Student;

public class AdminController {
public static void main(String[] args) {
ApplicationContext apc	= new AnnotationConfigApplicationContext(AppConfig.class);
 Student st = apc.getBean("stu",Student.class);
 System.out.println(st);
}
}
