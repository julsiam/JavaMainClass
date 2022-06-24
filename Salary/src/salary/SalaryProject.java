package salary;

import Temp2.Salary;

public class SalaryProject {

    public static void main(String[] args) {
//        Salary s = new Salary();
//        Salary s2 = new Salary(); //instantiating another value, 
//        s2. salaryType = "withAbsence"; //specifying the salaryType
//        float value = s2.getSalary(); //calling 
//        
//        System.out.println(value);
        System.out.println(Salary.getIntValue());  //static block doesn't need to be instantiated
        System.out.println(Salary.getDeduction());
//        SalaryProject p = new SalaryProject(); //but it needs to be instantiated kay non-static man sa ubos, basta di static, instantiate the class with the method
//        System.out.println(p.getStatus(1));
//        System.out.println(getStatus(0)); //but if its static, then no need for instantiation, just call the method.
         System.out.println(getDate(2022));
    }
    
//    static String getStatus(int x){  //methods in the same class - so no need for formality or instantiation, 
//        if (x==0){              
//            return "hahahahaha";
//        }
//        else{
//            return "huhuhuhu";
//        }
//    }
  
    
    static String getDate(int y){
        switch (y) {
            case 2022:
                return "Make your present great";
            case 2020:
                return "Its in the past, move on";
            default:
                return "Focus on your present, let the future deal itself";
        }
    }
}
