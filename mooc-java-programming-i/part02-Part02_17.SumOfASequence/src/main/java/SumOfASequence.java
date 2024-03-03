
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int last, count = 1, sum = 0;
        
        System.out.println("Last number?");
        last = Integer.valueOf(scanner.nextLine());
        
        while (count <= last) {
            sum += (count);
            count++;
        }
        System.out.println(sum);
    }
}
