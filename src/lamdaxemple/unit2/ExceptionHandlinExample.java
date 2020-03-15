package lamdaxemple.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlinExample {
	public static void main(String[] args) {
		int [] someNumbers= {1,2,3,4};
		int key =0;
		proccess(someNumbers, key,wrapperLamda( (v, k) ->{
			System.out.println(v /k);
		}));

	}

	private static void proccess(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNumbers) {
			consumer.accept(i, key);

		}
	}

private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer){
	return (a,b)->{try {
		consumer.accept(a, b);
		} 
	catch(ArithmeticException e) 
	{
		System.out.println("exception");
	}
};
}
}