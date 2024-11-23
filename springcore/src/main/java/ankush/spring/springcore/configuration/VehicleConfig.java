package ankush.spring.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ankush.spring.springcore.beans.VehicleType;
import lombok.ToString;

@ToString
@Configuration
@ComponentScan(basePackages = "ankush.spring.springcore.beans")
public class VehicleConfig {

	@Bean(name="vehicleType")
	public VehicleType getVehicleType() {
		
		return new VehicleType();
	}
}
