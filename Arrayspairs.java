import java.util.Scanner;

public class Arrayspairs {
    public static void main(String [] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = s.nextInt();
        }
            Pair(arr);
    }
    public static  void Pair(int arr[]) {
        int tp=0;
        for(int i=0;i<arr.length;i++) {
            int cur=arr[i];
            for(int j=i+1;j<arr.length;j++) {
                System.out.println("(" +cur+"," +arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
}
