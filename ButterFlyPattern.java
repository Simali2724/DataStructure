import java.util.Scanner;

public class ButterFlyPattern {
    public static  void Butter(int row) {
        for(int i=1;i<=row;i++) {
            //for first star bcz we will print firt phase like this (star)+spce(2*(row-i) + star(i)
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(row-i);j++) {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=2*(row-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public  static  void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int row=s.nextInt();
        Butter(row);
    }
}
