package ankush.spring.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Students {
	@Getter @Setter private int studentId;
	@Getter @Setter private Map<Integer,String> studentsMap;
	@Autowired
	@Qualifier("phoneList")
	@Getter @Setter private List<Integer> phones;
	@Getter @Setter private Properties properties;
	
}
