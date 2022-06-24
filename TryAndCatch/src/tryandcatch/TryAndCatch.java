/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryandcatch;

/**
 *
 * @author 1styrGroupB
 */
import java.util.Scanner;

public class TryAndCatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TryAndCatch t = new TryAndCatch();
  
        System.out.println("Enter a number (for numerator): ");
        int a = s.nextInt();

        System.out.println("Enter a number (for denominator): ");
        int b = s.nextInt();

        int result = t.divideThis(a, b);
        System.out.println(result);
    }

    int divideThis(int a, int b) {
        Scanner s = new Scanner(System.in);
        int result = 0;

        try {
            result = a / b;
        } catch (NumberFormatException e) {
            System.out.println(b + "is not a number");
        } catch (ArithmeticException e) {
            System.out.println("Bad input on " + b + "\nDenominator must not be equal to zero");
          
            TryAndCatch t = new TryAndCatch();

            System.out.println("\nEnter a number (for numerator): ");
            int newa = s.nextInt();

            System.out.println("Enter a number (for denominator): ");
            int newb = s.nextInt();

            result = newa / newb;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return result;
    }
}
