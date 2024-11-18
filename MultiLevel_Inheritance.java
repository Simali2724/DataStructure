public class MultiLevel_Inheritance {
    public static  void main(String args[]) {
        Dog dobby= new Dog();
        dobby.eat();
        dobby.bread="german";
        dobby.legs=4;
        dobby.Breath();
        System.out.println(dobby.bread);
        System.out.println(dobby.legs);
    }
}
class Animals {
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
class Mamle extends Animals {
    int legs;
}
class Dog extends Mamle{
    String bread;
}