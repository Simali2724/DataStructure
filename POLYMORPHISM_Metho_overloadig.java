public class POLYMORPHISM_Metho_overloadig {
    public static  void main(String args[]) {
        Calculator calci = new Calculator();
        System.out.println(calci.sum(1,2));
        System.out.println(calci.sum((float)1.5,(float)2.5));
        System.out.println(calci.sum(1,2,3));
    }
}


class Calculator {
    int sum(int a,int b) {
        return a+b;
    }
     float sum(float a, float b) {
        return a+b;
     }
      int sum(int a,int b,int c) {
        return a+b+c;
      }
}
