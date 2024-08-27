import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number");

		int a1 = sc.nextInt();

		System.out.println("Enter 2st number");

		int b1 = sc.nextInt();

		
		addition(a1, b1);
		
		
		

	}

	public static void addition(int a, int b) {
		int sum = a + b; 
		
		System.out.println("sum is "+ sum);

	}

}
