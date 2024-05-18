public class CountalphanumericCharacters {
    public static void main(String[] args) {
        String str ="G$k01p%";
        int count = countof(str);
        System.out.println("Count of Alphanumeric characters:" +count);
    }
    public static int countof(String str) {
        int c=0;
        for(int i=0;i<str.length();i++) {
            boolean flag1=Character.isAlphabetic(str.charAt(i));
            boolean flag2 = Character.isAlphabetic(str.charAt(i));
            if(flag1|| flag2) {
                c++;
            }
        }
        return c;
    }
}
