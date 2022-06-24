package inheritance;

//public class Employee extends Object
//public class Manager extends Employee
//public class Engineer extends Employee
//----------------------------------------
class Inheritance {

    public static void main(String[] args) {
        Employee e = new Object();
//        Manager m = new Employee();

        if (e instanceof Object) {
            System.out.println("it is ");
        } else if (e instanceof Employee) {
            System.out.println("it is not either");
        } else {
            System.out.println("yes it is");
        }
    }

}
