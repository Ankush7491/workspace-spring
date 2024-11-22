package ankush.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ankush.spring.springcore.beans.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String configFile="./ankush/spring/springcore/configuration/xmlConfig.xml";
        ApplicationContext context= new ClassPathXmlApplicationContext(new String[] {configFile});
        Employee employee=(Employee) context.getBean("employee");
        System.out.println(employee.toString());
        Employee employee2=(Employee) context.getBean("employee2");
        System.out.println(employee2.toString());
 
    }
}

