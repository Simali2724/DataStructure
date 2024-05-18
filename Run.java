import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Run {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row =s.nextInt();
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=row-i+1;i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
