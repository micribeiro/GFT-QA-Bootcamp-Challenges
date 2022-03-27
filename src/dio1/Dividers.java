package dio1;
import java.util.Scanner;

public class Dividers {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type a number and I tell you its dividers: ");
        int n = input.nextInt();
        
        System.out.println("Dividers of " + n + ":");

        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        } 
        
        input.close();
        System.out.println();
    }
	
}
