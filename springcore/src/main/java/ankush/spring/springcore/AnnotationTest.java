package ankush.spring.springcore;

import ankush.spring.springcore.beans.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="./ankush/spring/springcore/configuration/config.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[] {filePath});
		Book book =context.getBean("book1",Book.class);
		System.out.println(book.toString()); 

	}

}
