import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        //data type = arrayName[]= new datatype[size];
//        int marks[] = new int[50];
//        int number[] = {1,2,3};
//        int morenum[]={4,5,6};
//        String fruits[]={"Apple","Mango","Lichi"};
//        for(int i=0;i<number.length;i++) {
//            System.out.println(number[i]);
//        }
//            for(int j=0;j<fruits.length;j++) {
//                System.out.println(fruits[j]);
//
//            }
//        //take input from user
        int mark[] = new int[100];
        Scanner s= new Scanner(System.in);
         mark[0] = s.nextInt();
         mark[1]= s.nextInt();
         mark[2]=s.nextInt();
         System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        mark[2]=100;
        System.out.println(mark[2]);


    }
}
