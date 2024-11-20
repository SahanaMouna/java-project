package pack6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) throws IOException {
//		int a;
//		int b;
//	float num;
//	Scanner input=new Scanner(System.in);
//	System.out.println("enter a:");
//	a=input.nextInt();
//	System.out.println("a is"+" "+a);
//	System.out.println("enter b:");
//	b=input.nextInt();
//	System.out.println("b is"+" "+b);
//	try {
//	num=a/b;
//	System.out.println(num);
//	}
//	catch(Exception e) {
//		System.out.println("b should not be zero");
//		System.out.println(e);
//		e.printStackTrace();
//	}
//	System.out.println("end");
		File file=new File("C:\\Users\\ADMIN\\Desktop\\abc.txt");
		if(file.exists())
{
			System.out.println("file exist");
			}
		else {
			System.out.println("file not exist");

		}
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
	System.out.println(br.readLine());
	String str;
	while((str=br.readLine())!=null) {
		System.out.println(str);
	}
}

}
