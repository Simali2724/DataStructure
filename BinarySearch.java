import java.util.Scanner;

public class BinarySearch {
    public static  void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of element=");
        int n =s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the all element-");
        for(int i=0;i<n;i++) {

            arr[i]=s.nextInt();

        }
        System.out.println("Enter the nmber which  you want find");
        int key=s.nextInt();
        System.out.println("Our searched element idex ="+Binary(arr,key));
    }
    public static int Binary(int arr[],int key) {
        int st=0;
        int end= arr.length-1;
        while(st<=end) {
            int mid= (st+end)/2;
            if(arr[mid]== key) {
                return  mid;
            }
            else if(arr[mid] < key ) {
                end=mid-1;
            }
            else if(arr[mid]> key) {
                st=mid+1;

            }
        }
        return -1;
    }
}
