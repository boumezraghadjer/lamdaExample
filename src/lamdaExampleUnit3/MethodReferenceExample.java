package lamdaExampleUnit3;

public class MethodReferenceExample {
public static void main(String[] args) {
	//lamda like (noParameterters)->call Method -> use method reference
//	Thread t =new Thread(()-> printMessage());
	Thread t= new Thread(MethodReferenceExample::printMessage);// using method reference
	t.start();
}
public static void printMessage()
{
	System.out.println("hiiiiiii");
	}
}
//lamda like (noParameterters)->call Method