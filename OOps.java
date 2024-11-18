public class OOps {
    public static void main(String args[]) {
        Pen p1= new Pen();//construtor design
        p1.SetColor("Blue");//object call
        System.out.println(p1.Color);
        p1.SetTip(5);
        System.out.println(p1.tip);
        p1.SetColor("Red");
        System.out.println(p1.Color);
        p1.Color= "yellow";
        System.out.println(p1.Color);
    }

}
 class Pen {
    //properties + Function b
    String Color;//properties
     int tip;
     void SetColor(String newColor) {//funtion to change the ccolor of pen
         Color = newColor;
     }
     void SetTip(int newTip) {//function to change for tip int
         tip=newTip;
     }
 }
