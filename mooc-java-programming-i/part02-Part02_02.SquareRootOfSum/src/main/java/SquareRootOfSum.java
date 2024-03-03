
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user for values
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        // Caluclating the sum
        int sum = first + second;
        
        // Calculating the square root of the sum
        int squareRoot = (int) Math.sqrt(sum);
        
        // Displaying the result
        System.out.println(squareRoot);
    }
}
