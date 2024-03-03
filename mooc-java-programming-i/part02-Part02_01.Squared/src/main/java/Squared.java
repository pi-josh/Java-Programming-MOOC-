
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user for input
        int num = Integer.valueOf(scanner.nextLine());
        
        // Calculating the square of the given input
        int squared = num * num;
        
        // Displaying the result
        System.out.println(squared);
    }
}
