import java.util.Scanner;

public class PracticArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int arr[] = new int[500];
        arr[0] =s.nextInt();
        arr[1]=s.nextInt();
        arr[2]=s.nextInt();
        System.out.println(arr[0]+ " Physics");
        System.out.println(arr[1]+ " Chem");
        System.out.println(arr[2]+ " Math/Bio");

        arr[2]=98;//update value of arraye index 2

        System.out.println(arr[2]+ " Updated Math/bio");
        arr[2]=arr[2]+2;
        System.out.println(arr[2]+ " new Updated Math/bio");
        //lets find percentage
        System.out.println(((arr[0]+arr[1]+arr[2])/3)+ " Percent");
        // get the length of array
        System.out.println("Length of  array=" +arr.length);
        int percent = (arr[0]+arr[1]+arr[2])/3;
        System.out.println("Perecentage of all marks ="+percent);

    }
}
