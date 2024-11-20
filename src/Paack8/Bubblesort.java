package Paack8;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {73,34,48,18,65,14};
		int temp;
		System.out.println("before sort");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			}
	}

}
		System.out.println("after sort");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
}
	}
}
