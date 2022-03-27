package dio1;
import java.util.Scanner;
public class SundayMorning {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Type a time [h:mm]");
    	while (scan.hasNext()) {
    		String[] clock = scan.nextLine().split(":");    		
    		int hora = Integer.parseInt(clock[0]);
    		int min = Integer.parseInt(clock[1]);
    		
    		switch (hora) {
    			case(7): System.out.println("Maximum delay: " + min); break;
    			case(8): System.out.println("Maximum delay: " + (min + 60)); break;
    			case(9): System.out.println("Maximum delay: " + (min + 120)); break;
    			default: System.out.println("Maximum delay: 0");
    		}
    	} scan.close();
    } 
	
}
