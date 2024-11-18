public class Method_overRiding_Polymorphism {
    public  static  void main(String args[]) {
        Deer d= new Deer();
        d.eat();// it will wun only eat grass bcz it call the same function or method but child
    }
}

class Animal12 {
    void eat() {
        System.out.println("Eat anything");
    }
}
class Deer extends Animal12 {
    void eat() {
        System.out.println("Eat grass");
    }
}