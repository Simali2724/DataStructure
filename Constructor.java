public class Constructor {
    public static void main(String args[]) {
        Student s1= new Student("Moinuddeen hussain");//call the constructor
        System.out.println(s1.username);

    }
}
class Student {
String username;
int roll;
//    Student() {
//        // constructor does not return any type
//        System.out.println("this is constructor without argumetn");
//    } out put will be only this is constructor without argumetn if only put this in main class Strudent s1= new Stufrnt
Student(String username) {//for intialize the constructor function we have to give an arguments
    this.username=username;

}
class Student_noargument_pass{
    String name;
    int rollno;
    void Student_noagrument_pass() {
        // constructor does not return any type
        System.out.println("this is constructor without argumetn");
    }
}
}