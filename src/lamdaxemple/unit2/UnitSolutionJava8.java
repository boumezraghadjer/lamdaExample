package lamdaxemple.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lamdaxemple.Person;

public class UnitSolutionJava8 {
public static void main(String[] args) {
	List<Person> people= Arrays.asList(new Person("test1","Cest1",12), new Person("Cest2","test2",22),new Person("Hest3","test3",32),new Person("test4","test4",42),new Person("test5","test5",52));
	/*******************************/
	Collections.sort(people, (o1,o2) -> {
			return o1.getLastName().compareTo(o2.getLastName());
	});

/**************************************************/
	printConditionally(people, p -> {
		return true;
	}, p -> System.out.println(p.getAge()));
	/**************************************************/
	System.out.println("****************************************************");
	printConditionally(people, p -> {return p.getFirstName().startsWith("t");},  p -> System.out.println(p) );
}
// use out of the box interfaces -exemple predicate who ghas an function function test that return boolean

public static void printConditionally(List<Person> p,Predicate<Person> c, Consumer<Person> consumer){

	for(Person pp: p) {
		if(c.test(pp)) {
			consumer.accept(pp);;}
	}
}

	

}
