import java.util.Scanner;

public class CheakPalindromeofaString {
    public static boolean isPalindrome(String str) {
        for(int i = 0;i<str.length()/2;i++) {
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(isPalindrome(str));//intuit coding question
        //time comp-O(n) bcz its run ntime
    }
}
