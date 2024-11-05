import java.util.Scanner;

public class Revers {
    public static void main(String [] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        Rever(arr);
//        arr = reverseArray(arr); for use when it gives return type
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
    public static  void Rever(int arr[]) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            arr[l]=arr[l]+arr[r];
            arr[r]=arr[l]-arr[r];
            arr[l] = arr[l]-arr[r];
            l++;
            r--;
        }
    }
//    public static int[] reverseArray(int arr[]) {
//        int l = 0;
//        int r = arr.length - 1;
//
//        while (l < r) {
//            arr[l] = arr[l] + arr[r];
//            arr[r] = arr[l] - arr[r];
//            arr[l] = arr[l] - arr[r];
//            l++;
//            r--;
//        }
//
//        return arr;  // Return the reversed array
//    } for return type
}
