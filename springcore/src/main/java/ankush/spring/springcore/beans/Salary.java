package ankush.spring.springcore.beans;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Salary implements InitializingBean{
   @Getter @Setter private int fixed;
   @Getter @Setter private int gross;

	/*
	 * public void init() {
	 * 
	 * }
	 */
   
   @PreDestroy
   public void cleanUp() {
	   System.out.println("doing cleanup in destroy implementation");
   }
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Initializing Salary in init");
}
}
