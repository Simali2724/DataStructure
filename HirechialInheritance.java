public class HirechialInheritance {
public static void main (String args[]) {
    Mammle Dog = new Mammle();
    Dog.legs=4;
    Bird eagle= new Bird();
    eagle.eat();
    eagle.fly();
    Fishh shark = new Fishh(4);
    shark.setSkin_color("Blue");
    System.out.println(shark.Skin_color);
    System.out.println(shark.fin);
    System.out.println("Dog has "+Dog.legs);



}
}
class Animalss{
    String Skin_color;
    void setSkin_color(String color) {
        Skin_color=color;
    }
    void eat() {
        System.out.println("animal can eat");
    }
    void Breath() {
        System.out.println("animal can breath ");
    }

}
class Mammle extends Animalss {
    int legs;
}
class Fishh extends Animalss {//child class
    int fin;
    Fishh(int fin) {
        this.fin=fin;
    }
    void Swim() {
        System.out.println("Fish can swim");
    }
}
class Bird extends Animalss {
    void fly() {
        System.out.println("Birds can fly");
    }
}