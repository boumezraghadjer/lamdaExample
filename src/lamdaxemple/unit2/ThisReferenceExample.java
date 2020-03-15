package lamdaxemple.unit2;

import lamdaxemple.unit2.ClosuresExample.Process;

public class ThisReferenceExample {
	private static void doProcess(int i, Process p) {
		p.process(i);
	}
public static void main(String[] args) {
	
ThisReferenceExample referenceExample = new ThisReferenceExample();
referenceExample.doProcess(10, new Process() {

	@Override
	public void process(int i) {
		// TODO Auto-generated method stub
		System.out.println("value of i " + i);
		System.out.println(this);
	}
	public String toString(){
		return "this is the anonymous ";
	}
});
	
	
}
}
