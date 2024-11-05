import java.util.Scanner;

public class CalculateSubArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in );
        int n =s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++) {
            arr[i]= s.nextInt();
        }
        PrintSubArray(arr);
        int sub =(n*(n+1))/2;
        System.out.println("TOtal sub array"+sub);
    }
    public static void PrintSubArray(int arr[]) {
        int totalnumberofsubarray=0;
        for(int i =0;i<arr.length;i++) {
            //It is for runing the loop for all element
            int start=i;//we take index bcz if it take arr[i] the if we do increamment then then it goes like taht 2++=3 and 3 is not in the arry
            for(int j=i;j<arr.length;j++) {
                //this loop is showing or making pair by choosing end
                int end = j;
                for(int k=start;k<=end;k++){
                    //this loop is for printing he all subaaray
                   System.out.print(arr[k]+" ");

                }
                totalnumberofsubarray++;
                System.out.println();
            }
             System.out.println();
        }
        System.out.println(totalnumberofsubarray);
    }
}
