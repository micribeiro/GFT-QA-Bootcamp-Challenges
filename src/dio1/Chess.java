package dio1;
import java.util.Scanner;
public class Chess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Line number: ");
		int L = sc.nextInt();
		System.out.println("Column number: ");
		int C = sc.nextInt();
		
		System.out.println("1 - White and 0 - Black");
		System.out.println("Result: ");
		if ((L % C == 0) && (C % L == 0))
			System.out.println("1");
		else                                               //complete o código nos espaços em branco
			System.out.println("0");
		sc.close();
	}
}
