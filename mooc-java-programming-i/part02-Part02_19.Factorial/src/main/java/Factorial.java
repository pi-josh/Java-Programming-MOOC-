
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start, count, total = 1;
        
        System.out.println("Give a number:");
        start = Integer.valueOf(scanner.nextLine());
        count = start;
        while (count > 0) {
            total *= start;
            start--;
            count--;
        }
        
        System.out.println("Factorial: " + total);
    }
}
