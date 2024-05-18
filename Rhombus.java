import java.util.Scanner;

public class Rhombus {
    public static  void Rhom(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//        for(int i=1;i<=row-1;i++) {
//            for(int j=1;j<=row-i+1;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public  static  void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int row=s.nextInt();
        Rhom(row);
        Rhom(row);
    }
}
