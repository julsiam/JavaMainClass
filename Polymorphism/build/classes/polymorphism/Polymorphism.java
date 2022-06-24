package polymorphism;

import Inheritance.*;
public class Polymorphism {

    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        if (e instanceof Employee) {
            System.out.println("it is ");
//        } else if (e instanceof Manager) {
//            System.out.println("it is not either");
        } else {
            System.out.println("yes it is");
        }
    }

}
