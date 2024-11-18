public class Abstract_class {
    public static void main (String args[]) {
        Mustang myHorse = new Mustang();
       // Animal->Horse->Mustang->
//        Horse h= new Horse();
//        h.eat();
//        h.walk();
////        Chicken c =new Chicken();
////        c.eat();
////        c.walk();
//        System.out.println(h.color);// it give op as browm bcz when we call crate any object of child class then it doesn't call it'self constructor it calls Parant lass constructr
    }
}

abstract class Janwar {
    String color;
Janwar(){// we can create constructor in absyract class
     //color="Brown";
     System.out.println("janwar Constructoer call");
}
void eat() {
        System.out.println("Janawar kuch bhi khate hai");//non abstract class
    }
    abstract void walk();
}
class  Horse extends Janwar {
    Horse() {
        System.out.println("Horse cunstructor call");
    }
    void ChangeColor() {
         String color="Dark  Brown";
    }
    void walk() {
        System.out.println("Horse can walk on 4 leg");
    }
}
class Mustang  extends  Horse {
    Mustang() {
        System.out.println("Mustang class cunstrutor called");
    }
}
class Chicken extends Janwar {
    void walk() {
        System.out.println("Chicken can walk on 2 legs");
    }

}