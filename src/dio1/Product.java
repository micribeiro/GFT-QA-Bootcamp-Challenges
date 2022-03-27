package dio1;
import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		System.out.println("Type the number A: ");
		A = sc.nextInt();
		
		System.out.println("Type the number B: ");
		B = sc.nextInt();
		
		PROD = A * B;
		
		System.out.println("PRODUCT = " + PROD);
		
		sc.close();
		
	} 
}
