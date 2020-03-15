package lamdaxemple;

public class Greeter {
	public static void greet(Greeting greeting) {
		greeting.perform();
	}
	
public static void main(String[] args) {
	Greeter greeter= new Greeter();
//	HelloWordGreeter holHelloWordGreeter=new HelloWordGreeter();
//	greeter.greet(holHelloWordGreeter);
	
	Greeting myLambdaFunction= () -> System.out.println("hello lambda");
	myLambdaFunction.perform();
	//anonymous Inner (dakhel une classe) class
	Greeting innerClassGreeting= new Greeting() {
		
		@Override
		public void perform() {
		System.out.println("Hello Anynomous Inner Class");
			
		}
	};
	innerClassGreeting.perform();
	greet(myLambdaFunction);
	
}
}