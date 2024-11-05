import java.util.*;
public class Strings1 {
    public static void Printallletterofgivensstring(String str) {
        for(int i =0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static  void main(String [] args) {
//        char a[] = {'a','c','d','e','f'};
//        for(int i=0;i<a.length;i++) {
//            System.out.println(a[i]);
//        }
//        String str= "ALI";
//        String str1=new String("Hussain");
//        System.out.println(str);
//        System.out.println(str1);
        Scanner s= new Scanner(System.in);
//        String name = s.next();//it will only print word one word
//        System.out.println("using s.next()" +name);
//        String name1=s.nextLine();//it will print all of the things according to line
//        System.out.println("Whole line or whole word="+name1);
//        System.out.println(name1.length());
//        //Concatenation add two  or more then two string
        String FirstName ="MOinuddeen";
        String LastName="Hussain";
        String FullName= FirstName +" " + LastName;
        System.out.println(FullName);
        String str1=s.nextLine();
        String str2=s.nextLine();
        String str = str1+ " " +str2;
        //Use of charAt to find the letter of given string at specific point
        System.out.println(str.charAt(2));
          Printallletterofgivensstring(str);//to print all the letter of guiven string this is function



    }
}
