package lamdaxemple.unit2;

public class ClosuresExample {
// in java 8 we dont need to right final to declare b (the closure freezes the value of b)
	public static void main(String[] args) {
	int a=10;
	int b=20;
	doProcess(a, (i) ->
		System.out.println(i + b)	
	);

	}
	private static void doProcess(int i, Process p) {
		p.process(i);
	}
interface Process{
	void process(int i);
}
}
