public class TocheckStringeualityusingfunction {
    public static void main(String [] args) {
        String s1="Ali";
        String s2="Ali";
        String s3= new String("Ali");
        if(s1==s2) {
            System.out.println("YES");
        }
        else{
            System.out.println("not");
        }

        if(s1==s3) {
            System.out.println("YES");
        }
        else{
            System.out.println("not");
        }
        if(s1.equals(s3)) {
            System.out.println("YES");
        }
        else{
            System.out.println("not");
        }
    }
}
