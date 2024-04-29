import com.inga.library_users.AdultUser;
import com.inga.library_users.KidUser;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        //Test case #1
        KidUser kid1 = new KidUser();
        KidUser kid2 = new KidUser();

        kid1.setAge(10);
        kid2.setAge(18);

        kid1.registerAccount(); // displays account created successfully
        kid2.registerAccount(); // age must be under 12

        kid1.setBookType("Kids");
        kid1.requestBook(); //issued successfully
        kid1.setBookType("Fiction");
        kid1.requestBook(); //not issued

        //Test case #2
        AdultUser adult1 = new AdultUser();
        AdultUser adult2 = new AdultUser();

        adult1.setAge(5);
        adult2.setAge(23);

        adult1.registerAccount(); //must be over 12 years old
        adult2.registerAccount();// registered successfully

        adult2.setBookType("Kids");
        adult2.requestBook(); // not allowed to get kids books
        adult2.setBookType("Fiction");
        adult2.requestBook(); // issued successfully
    }
}