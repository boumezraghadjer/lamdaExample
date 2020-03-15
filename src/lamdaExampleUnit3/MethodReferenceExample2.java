package lamdaExampleUnit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lamdaxemple.Condition;
import lamdaxemple.Person;
import lamdaxemple.PersonInterf;
import lamdaxemple.PersonInterfImpl;

public class MethodReferenceExample2 {	public static void main(String[] args) {
	List<Person> people= Arrays.asList(new Person("test1","Cest1",12), new Person("Cest2","test2",22),new Person("Hest3","test3",32),new Person("test4","test4",42),new Person("test5","test5",52));


	System.out.println("****************************************************");
	printConditionally(people, p ->true,  System.out::println);//p-> Method(p)  becaude the complier realize that its a Consumer
}
// use out of the box interfaces -exemple predicate who ghas an function function test that return boolean

public static void printConditionally(List<Person> p,Predicate<Person> c, Consumer<Person> consumer){

	for(Person pp: p) {
		if(c.test(pp)) {
			consumer.accept(pp);;}
	}
}

}
//lamda like (noParameterters)->call Method