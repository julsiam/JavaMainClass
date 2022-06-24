package polymorph;

class Lolo {

    public String getDanceStyle(){
        return "chacha";
    }
}

class Papa extends Lolo{
    @Override
    public String getDanceStyle(){
        return "titodance";
    }
    
}


class Dodong extends Papa{
    public String getDanceStyle(){
        return "tiktokdance";
    }
}

class Silingan extends Dodong{
    public String getDanceStyle(){
        return "twerktwerk";
    }
}


public class Polymorph {

    public static void main(String[] args) {
        Lolo l = new Lolo();
        Papa p = new Papa();
        Dodong d = new Dodong();
        Silingan s = new Silingan();
        printDanceStyle(l);
        printDanceStyle(p);
        printDanceStyle(d);
        printDanceStyle(s);
        printAge(l);
        printAge(p);
        printAge(d);
        printAge(s);
        
    }
    
    public static void printDanceStyle(Lolo l){
        System.out.println(l.getDanceStyle());
    }
    
    public static void printAge(Lolo l){
        if (l instanceof Dodong){
            System.out.println("<20 Years Old");
        }
        else if( l instanceof Papa){
            System.out.println(">20 but <35");
        }
        else if( l instanceof Lolo){
            System.out.println(">60 Years");
        }
        else{
            System.out.println("Di kaliwat");
        }
    }
}
