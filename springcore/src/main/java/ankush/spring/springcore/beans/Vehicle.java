package ankush.spring.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Vehicle {
	@Getter @Setter private int vin;
	@Value("Suzuki")
	@Getter @Setter private String make;
	@Autowired
	@Getter @Setter private VehicleType vehicleType;
}
