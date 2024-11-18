public class HybridInheritance {
    public static void main(String args[]) {
        Tuna t = new Tuna();
        t.eat();
        Human h= new Human();
        h.walks();
       Peacock b = new Peacock();
        b.fly();
        b.quality();
        b.eat();
    }
}
class Animal1 {
    void eat() {
        System.out.println("animal can eat");
    }

}
class Fishes extends Animal1 {
    void swim() {
        System.out.println("Fish can swim");
    }
}
class Shark extends Fishes {
    void Color(){
        System.out.println("Shark's color is white");
    }
}
class  Tuna extends  Fishes{
    void Type() {
        System.out.println("Eatable tune");
    }
}
 class Birds extends  Animal1 {
     void fly() {
         System.out.println("Bird can fly");
     }
 }
 class Peacock extends  Birds {
    void quality () {
        System.out.println("Peacock is National bird");
    }
 }
  class Mammels extends Animal1 {
    void walks() {
        System.out.println("Mammels can walk");
    }
  }
  class Dogss extends  Mammels {
    void Pet() {
        System.out.println("Dog is a pet animal who can walk");
    }
  }
  class Cat extends  Mammels {
    void cute() {
        System.out.println("cat is very cute ");
    }
  }
  class Human extends  Mammels {
    void Bones() {
        System.out.println("Human has 206 bones i it's body");
    }
  }