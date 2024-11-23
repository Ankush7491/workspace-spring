package ankush.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ankush.spring.springcore.beans.Vehicle;
import ankush.spring.springcore.beans.VehicleType;
import ankush.spring.springcore.configuration.VehicleConfig;

public class ConfigurationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="./ankush/spring/springcore/configuration/config.xml";
	//	ApplicationContext context= new ClassPathXmlApplicationContext(new String[] {filePath});
		ApplicationContext context= new AnnotationConfigApplicationContext(VehicleConfig.class);
		Vehicle vehicle=context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle.toString());
		VehicleType vehicleType	= context.getBean("vehicleType",VehicleType.class);
		System.out.println(vehicleType.toString());
	}

}
