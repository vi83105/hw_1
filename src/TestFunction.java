
import java.util.Scanner;

public class TestFunction {
	/** Main method */
	public static void main(String[] args){
		System.out.println("Please enter the value of x.");
		Scanner aaa = new Scanner(System.in);
		double x = aaa.nextInt();
		//invoke constructor and create object
		Function1 f1 = new Function1();
		System.out.println(f1.f(x));
		Function2 f2 = new Function2();
		System.out.println(f2.f(x));
		Function3 f3 = new Function3();
		System.out.println(f3.f(x));
		Function4 f4 = new Function4();
		System.out.println(f4.f(x));
		Function5 f5 = new Function5();
		System.out.println(f5.f(x));
		Function6 f6 = new Function6();
		System.out.println(f6.f(x));
		Function7 f7 = new Function7();
		System.out.println(f7.f(x));
	}

}
