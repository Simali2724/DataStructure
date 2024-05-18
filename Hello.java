import java.util.*;
import java.io.*;

class Hello {
  public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int row=s.nextInt();
       for(int line=1;line<=row;line++) {
        for(int star=1;star<=row-line+1;star++) {
            System.out.print("*");
        }
        System.out.println();
       }           
}
}
