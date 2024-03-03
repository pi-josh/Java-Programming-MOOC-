
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the starting number
        int start = Integer.valueOf(scanner.nextLine());
        
        for (int i = start; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
