import java.util.Scanner;

public class Arraysmallandlarge {
    public static int FindLargest(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        int Smallest =Integer.MAX_VALUE;
        for(int a=0;a<arr.length;a++) {

             if(Largest< arr[a]) {
                 Largest=arr[a];
             }
             if(Smallest>arr[a]) {
                 Smallest=arr[a];
             }
        }
        System.out.println("Smallest number is" +Smallest);
        return Largest;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        for(int b=0;b<n;b++) {
             arr[b] = s.nextInt();
        }
        System.out.println("Our largest value of array is" +(FindLargest(arr)));
    }
}
