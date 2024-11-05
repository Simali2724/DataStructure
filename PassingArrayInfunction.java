public class PassingArrayInfunction {
    public static  void update(int marks[], int nonchangeble) {
         nonchangeble=10;
         System.out.println(nonchangeble);//but agar ise yaha print kareyneg toh ye iski value hi dega
        for(int i=0;i<marks.length;i++) {
            marks[i] = marks[i] + 1;
        }
//        for(int i =0;i<marks.length;i++){
//            System.out.print(marks[i]+ " ");
//        }
//        System.out.println(); we can print all updated value by thish also

    }


    public  static  void main(String[] args) {
        int marks[] = {97,98,99};
        int nonchangeble=5;//ye aise hi rahega change nhi hoga bhale iski value main function me badal de;
        update(marks,nonchangeble);
        System.out.println(nonchangeble);
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }

    public static class Arraylargandsmall {
    }
}

