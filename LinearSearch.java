import java.util.Scanner;

public class LinearSearch {
    public static  int linear(int number[],int key ) {
        for(int i=0;i<number.length;i++) {
            if(number[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static  int StringSerch(String menu[],String k)
    {
        for(int i=0;i<menu.length;i++) {
            if(menu[i]=="Chat") {
                return i;
            }
        }
        return -2;
    }

    public static  void main(String[] args) {
        int number[]={2,3,4,5,6,7,8,9,10,11,12,34,23,54};
        String menu[]={"Dosa","Idli","Sambhar","Chat","Gajar"};
        Scanner s= new Scanner(System.in);
        String k="Chat";
        int key=s.nextInt();
        int index1= StringSerch(menu,k);
        if(index1==-2) {
            System.out.println("Food not found");
        }
        else{
            System.out.println("Food found at this point ="+index1);
        }
        int index = linear(number,key);
        if(index==-1) {
            System.out.println("NOt found");
        }
        else {
            System.out.println("Index has been found= "+index);
        }
    }
}
