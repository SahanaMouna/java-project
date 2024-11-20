package Exxception_handle;

import java.util.Scanner;

public class Demo_exception {

	public static void main(String[] args) {
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("enter value a:");
		a=input.nextInt();
		System.out.println("enter value b:");
		b=input.nextInt();
		try {
		System.out.println(a/b);
	}
catch(Exception e) {
	System.out.println("numerator is not divisible by zero");
	System.out.println(e);
	e.printStackTrace();
}
		System.out.println("end of the program");
}
}