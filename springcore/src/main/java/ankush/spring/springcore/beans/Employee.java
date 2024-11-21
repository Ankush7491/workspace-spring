package ankush.spring.springcore.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Employee {
    @Getter @Setter private int employeeId;
    @Getter @Setter	private String employeeName;
    @Getter @Setter private String employeeAddres;
}
