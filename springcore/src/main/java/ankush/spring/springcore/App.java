package ankush.spring.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ankush.spring.springcore.beans.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String configFile="./ankush/spring/springcore/configuration/xmlConfig.xml";
        AbstractApplicationContext context= new ClassPathXmlApplicationContext(new String[] {configFile});
        Employee employee=(Employee) context.getBean("employee");
        System.out.println(employee.toString());
        Employee employee2=(Employee) context.getBean("employee2");
        System.out.println(employee2.toString());
        Employee employee3=(Employee) context.getBean("ciemployee");
        System.out.println(employee3.toString());
        Employee employee4=(Employee) context.getBean("cemployee");
        System.out.println(employee4.toString());
        Employee employee5=(Employee) context.getBean("cemployee2");
        System.out.println(employee5.toString());
        context.registerShutdownHook();
 
    }
}

