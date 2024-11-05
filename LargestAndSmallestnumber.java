public class LargestAndSmallestnumber {
    public static int Largest(int number[]){
        int largest=Integer.MIN_VALUE;//-Infinte
        for(int i=0;i<number.length;i++) {
            if(largest<number[i]) {
                largest=number[i];
            }
        }
        return largest;
    }
    public static int Smallest(int number[]) {
        int Smallest= Integer.MAX_VALUE;//+infinite
        for(int i=0;i<number.length;i++) {
            if(Smallest>number[i]) {
                Smallest=number[i];

            }
        }
        return  Smallest;
    }
    public static void main(String [] args) {
        int number[]= {2,3,5,1,7,8,10,23};
        System.out.println("Smallest number ="+Smallest(number));
        System.out.println("Laregest number ="+Largest(number));

    }
}
