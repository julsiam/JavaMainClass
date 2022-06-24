package palindrome;

import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        int cnt = word.length();
        String newWord = "";
        while (cnt > 0) {
            newWord = newWord + word.charAt(cnt - 1);
            cnt--;
        }
        if (newWord.equals(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}
