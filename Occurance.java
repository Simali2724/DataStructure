import java.util.*;
import java.io.*;
public class Occurance {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) {
        arr[i] = s.nextInt();
    }
    int num = s.nextInt();
    int occ =s.nextInt();
    int count=0;
    int index = -1;
    for(int i=0;i<n;i++) {
         if(arr[i]==num)
         {
            count++;
            if(count==occ) {
                index =i;
                break;
            }
         }
    }
    System.out.println(index);
  }  
}
