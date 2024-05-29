
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String text = scanner.nextLine();
        
            if(!text.equals("")) {
                String[] texts = text.split(" ");
                for(int i = 0; i < texts.length; i++) {
                    System.out.println(texts[i]);
                }
            } else {
                break;
            }
        }
    }
}
