package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        System.out.println("Enter a word/number: ");
        String w, reverse = "";
        Scanner p = new Scanner(System.in);    //to get an input from the user
        w = p.nextLine();

        int length = w.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + w.charAt(i);
        }
        if (w.equals(reverse)) {
            System.out.println(w + " is a palindrome.");
        } else {
            System.out.println(w + "  isn't a palindrome.");
        }
    }
}





//public class Palindrome {
//
//    public static boolean isPalindrome(int num[]) {
//
//        for (int i = 0; i < num.length / 2; ++i) {
//
//            if (num[i] != num[num.length - 1 - i]) {
//
//                return false;
//
//            }
//
//        }
//
//        return true;
//
//    }
//
//    public static void main(String[] args) {
//
//        int array[] = {5, 1, 1, 5};
//
//        System.out.print("Is it a Palindrome: ");
//
//        System.out.println(Palindrome.isPalindrome(array));
//
//    }
//
//}
