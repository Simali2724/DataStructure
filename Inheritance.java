public class Inheritance {
    public static void main(String args[]) {
            Fish Shark= new Fish(1);
            System.out.println("Number of fins which have shark is " +Shark.fin);
            Shark.setSkin_color("Blue");
            //Shark.Skin_color="Blue";
            System.out.println("The color of shark is " +Shark.Skin_color );
            Shark.eat();//it takes property from the animal class
            Shark.Breath();
            Shark.Swim();

    }
}
 class Animal {
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
 }class Fish extends Animal {//child class
    int fin;
    Fish(int fin) {
        this.fin=fin;
    }
    void Swim() {
        System.out.println("Fish can swim");
    }
}
