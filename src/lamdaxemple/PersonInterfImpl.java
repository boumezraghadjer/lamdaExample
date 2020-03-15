package lamdaxemple;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonInterfImpl implements PersonInterf {

	@Override
	public void sortPerson(List<Person> p) {
		Collections.sort(p, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

	}

	@Override
	public void printPersonNameC(List<Person> p) {
		// TODO Auto-generated method stub
		for(Person pp: p) {
			if(pp.getLastName().startsWith("C")) {
			System.out.println(pp);}
		}
	}
	public void printConditionally(List<Person> p, Condition condition){
		// TODO Auto-generated method stub
		for(Person pp: p) {
			if(condition.test(pp)) {
			System.out.println(pp);}
		}
	}
	@Override
	public void printPerson(List<Person> p) {
	for(Person pp: p) {
		System.out.println(pp);
	}
		
	}

}
