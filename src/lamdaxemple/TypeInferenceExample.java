package lamdaxemple;

public class TypeInferenceExample {
public static void main(String[] args) {
//StringLengthLamda myLamda=s -> s.length();
//
//System.out.println(myLamda.getLength("hellcooo"));
	printLambda(s->s.length());
}
public static void printLambda(StringLengthLamda l) {
	System.out.println(l.getLength("kkkkkk"));
}

interface StringLengthLamda{
	int getLength(String s);
}
}
