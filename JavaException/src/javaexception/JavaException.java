package javaexception;

import java.util.Scanner;

public class JavaException {

    public static void main(String[] args) {

//        Scanner i = new Scanner(System.in);
//        int num = i.nextInt();
//        int sum = 0;
//        for (String x : args) {
//            try {
//                sum += Integer.parseInt(x);
//            } 
//            
//            catch (NumberFormatException e){
//                
//                System.out.println(x + "is not a number");
//            }
//            
//            catch (Exception e){
//                System.out.println("Bad input on " +x);
//            }
//        }
//        System.out.println(sum);

        JavaException je = new JavaException();

        try {
            int result = je.divideThis(1, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    int divideThis(int a, int b) {
        int result = 0;
        result = a / b;
        return result;

//        try {
//            result = a / b;
//        } 
//        catch (IllegalArgumentException e) {
//            return result;
//        }
    }
    
    
    int doThis() throws Exception{
        for(int x=0; x<10; x++){
            System.out.println(x);
            try{
                Thread.sleep(1000); //1000milliseconds = 1second
            }
            catch(Exception e){
                
            }
        }
        return 0;
    }
}

//int result = 0;
//        System.out.println("Enter a number (for numerator): ");
//        int a = s.nextInt();
//
//        System.out.println("Enter a number (for denominator): ");
//        int b = s.nextInt();
//        
//        for (String x : args) {
//            try {
//                result += Integer.parseInt(x);
//
//            } catch (NumberFormatException e) {
//                System.out.println(x + "is not a number");
//            } catch (ArithmeticException e) {
//                System.out.println("Bad input on " + x + "\nDenominator must not be equal to zero");
//                 TryAndCatch t2 = new TryAndCatch();
//
//                System.out.println("Enter a number (for numerator): ");
//                int newa = s.nextInt();
//
//                System.out.println("Enter a number (for denominator): ");
//                int newb = s.nextInt();
//
//                result = newa / newb;
//            }
//        }
//        System.out.println(result);