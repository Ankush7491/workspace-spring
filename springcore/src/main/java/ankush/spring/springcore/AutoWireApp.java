package ankush.spring.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ankush.spring.springcore.beans.Employee;

public class AutoWireApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="./ankush/spring/springcore/configuration/autowireConfig.xml";
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(new String[] {filePath});
		Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee.toString());
		 Employee employee2=(Employee) context.getBean("employee2");
	        System.out.println(employee2.toString());
	}

}
