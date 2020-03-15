package lamdaxemple;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class UnitExam {
	public static void main(String[] args) {
		List<Person> people= Arrays.asList(new Person("test1","Cest1",12), new Person("Cest2","test2",22),new Person("Hest3","test3",32),new Person("test4","test4",42),new Person("test5","test5",52));
		PersonInterf in =new PersonInterfImpl();
		// step 1 : sort list by lastname
		in.printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("C");
			}
		});
		in.sortPerson(people);	
		// step 2 : create a method that prints all elements in the list
		in.printPerson(people);	
		System.out.println("Step 3");
		// step 3: Create a method that prints all people that have last name beginnin with C
		in.printPersonNameC(people);
		System.out.println("c");


	}
}
