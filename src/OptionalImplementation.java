import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> courses=List.of("JAVA","SPRING","HIBERNATE","REST","ANGUKAR","WEBSERVICE");
		
		Predicate<? super String> predicate = course -> course.startsWith("b");
		
		Optional<String> optional = courses.stream().filter(predicate).findFirst();
		Optional<String>  emptyv=Optional.empty();
		
		System.out.println(optional);
		System.out.println(optional.empty());
		System.out.println(optional.isPresent());

	}

	

}
