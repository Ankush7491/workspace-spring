package ankush.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ankush.spring.springcore.collections.Students;

public class CollectonsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="./ankush/spring/springcore/configuration/collectionsConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {filePath});
		Students students=(Students) context.getBean("students");
		System.out.println(students.toString());
		System.out.println(students.getPhones().getClass().getName());
		
	}

}
