package inheritancelolo;

//lolo 10
//papa 20
//dodong 30
import InheritanceDodong.*;

public class InheritanceLolo {

    int yuta = 100;

    public static void main(String[] args) {

        Dodong d = new Dodong();  //dodong is the one we acessed so kung asa siya niinheret ddto niya makuha iyang value.        /*Inheritance*/
        //kung asay duol nga value, ddto siya muoinhirit

        System.out.println("Inheritance Result");
        System.out.println(d.yuta);  //the output is 20 kay niinheret raman siya sa kay papa nga naay 20 nga yuta

        //Here, the getBahin method can only be accessed sa kay lolo nga class and lolo has only 10 yuta, so divide by two, the output is 5
        System.out.println(d.getBahin(2)); //so we call the method getBahin then the value inside the parameter which is the numOfChildren and the value of 2
//        System.out.println(d.getBahin(2, 4)); //here, we call the second method, then declare the value sa getBahinLola, niya si lola kay naay 4 nga bahin
    }
}


//Lolo d = new Lolo();
//System.out.println(d.yuta);
//System.out.println(d.getBahin(2));

//ang first method ng getBahin, mo call siya sa kay lolo nga yuta which is 10, even thu naay d nga for dodong but the method matters. 