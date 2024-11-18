public class AcceesMOdifiedSpecifier {
    public static void main(String Args[]) {
                      Bank_Account MyAcco= new Bank_Account();
        MyAcco.username="Moinuddeen Hussain";
       // MyAcco.Password ="Delta@2024"; it is private thats why we can not use in main function
        MyAcco.SetPassword("Delta@2024");
        System.out.println("User name of account  " + MyAcco.username);
        MyAcco.SetPassword("New pass which can be acces by using getter");

        System.out.println(MyAcco.getPassword());
    }
}
class Bank_Account{
    public String username;
    private String Password;
    //to return the value which are in private form
    String getPassword(){
        return this.Password;//this ,this keyword is used to refer to the current object refer
    }

    void SetPassword(String pwd) {
        Password = pwd;
    }
}
