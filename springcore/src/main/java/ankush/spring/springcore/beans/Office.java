package ankush.spring.springcore.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Office {
    @Getter @Setter private int pin;
    @Getter @Setter private String officeName;
}
