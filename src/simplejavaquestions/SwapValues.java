package simplejavaquestions;

public class SwapValues {

	public static void main(String[] args) {
		int a = 5;
		int b =4;
		
		b= a+b;//9
		a =b-a;//5
		b=b-a;
		System.out.println("new value of a :"+a);
		System.out.println("new value of b :"+b);
	}

}
