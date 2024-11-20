package pack2;

public class Demo {

	public static void main(String[] args) {
		Program2 obj=new Program2("SAHANA",13,75);
		System.out.println(obj.Name);
		System.out.println(obj.rollno);
		obj.exam();
		obj.result();
		Program2 obj1=new Program2("MOUNA",24,85);
		System.out.println(obj.Name);
		System.out.println(obj.rollno);
		obj.exam();
		obj.result();


	}

}
