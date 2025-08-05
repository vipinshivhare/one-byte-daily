class Dog{
    void sound(){
        System.out.println("Any sound");
    }
}
class Bitch extends Dog{
    void bachao(){
        System.out.println("bachao.. bachao");
    }
}

class Puppy extends Bitch{
    void bark(){
        System.out.println("bhau..bhau..");
    }
}

public class multi_level_inherit{
    public static void main(String[] args){
        Puppy bitch = new Puppy();
        bitch.bachao();
        bitch.sound();
        bitch.bark();
        
    }
}
