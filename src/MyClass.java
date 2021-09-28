import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter your name");

        String userName = myObj.nextLine();
        System.out.println("username is: " + userName );
    }
    
}
