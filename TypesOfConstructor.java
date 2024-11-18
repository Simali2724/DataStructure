public class TypesOfConstructor {
public static  void main(String args[]) {
    Student1 s1= new Student1();
    Student1 s2= new Student1("Moinudeeen Hussain");
    Student1 s3= new Student1(03);
    System.out.println(s2.name);
    System.out.println(s3.roll);
}
}
class Student1 {
    String name;
    int roll;
    Student1() {
        System.out.println("To print or call this constructor we have to delete all the constructor");// this type of construtor is call non parameterrized constructor and it can be called like this Student s1= new Student();
    }
               Student1(String name) {
        this.name=name;// this type of constructor is called parameterized constructor  it is call in main function like Student s2 = new Student("ALi"); sysout(s2.name); ny the passing argument or parameter
    }
    Student1(int roll) {
       // this.name= name;
        this.roll=roll;
    }
}
