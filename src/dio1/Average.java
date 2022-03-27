package dio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double A, B, average;
        
        System.out.println("Type a number: ");
        A = sc.nextDouble();
        
        System.out.println("Type another number: ");
        B = sc.nextDouble();

        average = (A * 3.5 + B * 7.5)/11; 

        System.out.printf("Average = %.5f", average);
        System.out.println();
        
        sc.close();
	}

}
