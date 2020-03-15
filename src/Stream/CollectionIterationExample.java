package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import lamdaxemple.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(new Person("test1","Cest1",12), new Person("Cest2","test2",22),new Person("Hest3","test3",32),new Person("test4","test4",42),new Person("test5","test5",52));
System.out.println("Afficher la liste");
//for(int i=0; i<people.size();i++) {
//System.out.println(people.get(i));	
//}
//System.out.println("Afficher la liste Person p");
//for(Person p:people) {
//System.out.println(p);	
//}
//System.out.println("Afficher la liste Foreach");
//people.stream()
//.filter(p->p.getLastName().startsWith("t")).forEach(System.out::println);

long count = people.stream().filter(p->p.getLastName().startsWith("C")).count(); 
System.out.println(count);
	}

}
