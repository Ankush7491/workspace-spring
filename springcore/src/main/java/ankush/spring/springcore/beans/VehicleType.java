package ankush.spring.springcore.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@AllArgsConstructor
public class VehicleType {
	@Getter @Setter private int typeId;
	@Value("Hatchback")
	@Getter @Setter private String typeName;
}
