package oops;

class Ram{
    void father(){
        System.out.println("Ram is father");
    }
}
class Love extends Ram{
    void son1(){
        System.out.println("First Son");
    }
}
class Kush extends Ram{
    void son2(){
        System.out.println("Second Son");
    }
}

public class Hybrid_inheritance {
       public static void main(String[] args){
        Kush k = new Kush();
        k.son2();
        k.father();
        
        
    }
    
}
