import java.util.Scanner;

public class CalculateMaximumSumoFSubarray {
public static void main(String [] args) {
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int arr[]= new int[n];
    for(int i =0;i<n;i++) {
        arr[i]=s.nextInt();
    }
    MaxSubArraySum(arr);


}
public static void MaxSubArraySum(int arr[]) {
    int cur=0;//current sum of sub array for compare with max to find the maximum element
    int max=Integer.MIN_VALUE;
    for (int i =0;i<arr.length;i++) {
        int start=i;
        for(int j=i;j<arr.length;j++){
            int end = j;
            cur=0;
            for(int k = start;k<=end;k++) {
                cur+=arr[k];//calculate the sum of sub array

            }
            System.out.println(cur);//print all the cum of subarray
            if(max<cur) {
                max=cur;//update if max is less then the cure
            }

        }
    }
    System.out.println("MAX sum of sub array=" +max);
}
}
