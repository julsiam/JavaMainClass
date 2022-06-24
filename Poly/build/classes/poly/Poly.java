package poly;

//Polymorphism - many forms




class Employee {

//        public static int add(int a, int b){
//            return a * b ;
//        }
//        
    public void instance() {
        System.out.println("The instanceof operator");
                
    }
}


class Manager extends Employee {

//    public void instance() {
//        System.out.println("I inherit from the Employee");
//    }
}


class Engineer extends Employee {
//    public void instance(){
//        
//    }
}

public class Poly {

    public static void main(String[] args) {
//        System.out.println(Employee.add(2,10));
        
        Employee e = new Employee();
        Manager m = new Manager();
        Engineer n = new Engineer();
        e.instance();
        m.instance();
        n.instance();

        if (e instanceof Employee) {
            System.out.println("e is the result of Employee");
        }
        else if (e instanceof Manager){
            System.out.println("e is the result of Manager");
        }
        else if (e instanceof Engineer){
            System.out.println("e is the result of Engineer");
        }
        else {
            System.out.println("Undefined");
        }
        
        
    }

}
