package pack6;

import java.util.Scanner;

public class Sum {
	
    public static void add() 
    {
    	int a=7;
    	int b=8;
System.out.println(a+b);
}
    public static void add(int a) 
    {
    	int b=78;
System.out.println(b+a);
}
    public static void add(int a,int b) 
    {
System.out.println(a+b);
System.out.println(a*b);
}
    public static void add(int a,int b,int c) 
    {
System.out.println(a*(b+c)==(a*b)+(a*c));
System.out.println(a+(b+c)==a+(b+c));
}
    public static void main(String arg[]) {
//    	add();
//    	add(7);
//    	add(56,76);
//    	add(5,5,7);
    	int a,b,c,d;
    	String str;
    	Scanner input=new Scanner(System.in);
    	for(int i=0;i<=5;i++) {
    	System.out.println("enter name:");
    	str=input.next();
    	System.out.println("enter mark1:");
    	a=input.nextInt();
    	System.out.println("enter mark2:");
    	b=input.nextInt();
    	System.out.println("enter mark3:");
    	c=input.nextInt();
    	if((a>=35)&&(b>=35)&&(c>=35)) {
    	d=((a+b+c)/3);
    	System.out.println(d);
    	System.out.println("Name is"+" "+str);
    	System.out.println("mark1  is"+" "+a);
    	System.out.println("mark2  is"+" "+b);
    	System.out.println("mark3 is"+" "+c);
if(d>=85) {
    		System.out.println("Distinction ");
    	}
    	else if(d<=70)
    	{
    		System.out.println("first class");
    	}
    	
    	else if(d<=50)
    	{
    		System.out.println("second class");
    	}
    	}
    	
    	else
    	{
    		System.out.println("fail");
    	}
    	}	
    }
}
