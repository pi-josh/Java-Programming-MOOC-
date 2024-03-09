

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
        boolean isFound = false;
        for(int index = 0; index < array.length; index++) {
            if(array[index] == searching) {
                isFound = true;
                System.out.println(String.format("%d is at index %d.", searching, index));
                break;
            }
        }
        if(!isFound) {
            System.out.println(String.format("%d was not found.", searching));
        }
    }
}
