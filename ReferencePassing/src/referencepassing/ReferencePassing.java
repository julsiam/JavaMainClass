package referencepassing;

import PassRef.*;
import java.util.Scanner;

public class ReferencePassing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("From: ");
        int from = input.nextInt();
        
        System.out.println("To: ");
        int to = input.nextInt();
        for (int i = from;  i <= to; i++) {
            System.out.println(i);
        }
    }

}
