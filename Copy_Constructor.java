public class Copy_Constructor {
    public static void main(String args[]) {
        Student_Copy s1= new Student_Copy();
        s1.name="Moinuddeen ";
        s1.roll=03;
        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=100;

        Student_Copy s2= new Student_Copy(s1);
        s2.password="Delta@2024";
        s1.marks[2]= 101;
        System.out.println(s2.name);
        System.out.println(s2.password);
        for(int i =0;i<3;i++) {
            System.out.println(s2.marks[i]);
        }
      System.out.println(s2.roll);
    }
}
class Student_Copy{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

////shallow copy constructor
     Student_Copy(Student_Copy s1) {
         this.name=s1.name;
         this.roll=s1.roll;
         this.marks=s1.marks;
       //to updatethe value of marks thats why it is not copy acctual araty it takes only refferance of it that is called deep copy


     }

    Student_Copy() {
        System.out.println("This is the default construcor where which wiil be copy in another object or construr");


    }
    //new Deep copy constructor for copy the array ans it will not reflect or show the change in other object
//    Student_Copy(Student_Copy s1) {
//        this.name=s1.name;
//        this.roll=s1.roll;
//        for(int i=0;i<marks.length;i++) {
//        this.marks[i] = s1.marks[i];
//        }
//    }
}
