package pack7;

import java.util.Scanner;

public class Hunt {
	public static void main(String[] args) {
		String str;
		boolean won=false;
		int secret_num=789;
		int num;
		String opt1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter name:");
    	str=input.nextLine();
    	System.out.println("Name is"+" "+str);
    	for(int i=0;i<=3;i++) {
    		System.out.println("enter num:");
        	num=input.nextInt();
		    if(num==secret_num)
		    {
		    	System.out.println("you won the game");
		    	won=true;
		    	break;
		    }
		    else if((num>=600)&&(num<=800))
		    	{
		    		System.out.println("your num is nearest to secret number.");
		    		System.out.println("Do u like to have a hint ?");
		    		System.out.println(" ");
		    		System.out.println("enter yes/no:");
				    opt1=input.next();
				    if(opt1=="yes")
				    	{
				    		System.out.println(" num is greater than 600  ");
				    	}
				    else if(opt1=="no")
				    	{
				    		System.out.println("Thank u");
				    	}
		    		
		    	}
		    	
		    else
		    	{
		    		System.out.println("good luck next time.");
		    	}
		    
	
		    	
		    	}
    	if(won==false) {
    		System.out.println("you lost");
    	}
    	}}

	
	

