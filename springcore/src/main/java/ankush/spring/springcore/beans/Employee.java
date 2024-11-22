package ankush.spring.springcore.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Employee {
    @Getter @Setter private int employeeId;
    @Getter @Setter	private String employeeName;
    @Getter @Setter private String employeeAddress;
    @Getter @Setter private Salary salary;
}
