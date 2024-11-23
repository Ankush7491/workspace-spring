package ankush.spring.springcore.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Component("book1")
@Scope("prototype")
public class Book {
	@Value("#{34+90}")
	@Getter @Setter private int bookId;
	@Value("HarryPotter")
	@Getter @Setter private String bookName;
	@Value("#{authors}")
	@Getter @Setter private List<String> authorsList;
}
