package java_interface;

import Interface.*;

public class Java_Interface { //interface is an outline of the class, just lke the abstract method, it has no body. Ind to access it

    
    public static void main(String[] args) {
        
        ImplementsClass IC = new ImplementsClass();
        System.out.println(IC.getSum(20, 10));
        System.out.println(IC.getSubtract(20, 10)); 
        System.out.println(IC.getTimes(20, 10)); 
        System.out.println(IC.getDivide(20, 10)); 
                
        
//        for(int i = 0; i < 5; i++){
//            System.out.println(IC.getNext());
//        }
    }
  
    
}
