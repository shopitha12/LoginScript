import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Password";

        Scanner check = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String enteredUsername = check.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = check.nextLine();

        check.close();

        if(enteredUsername.equals(username)&& enteredPassword.equals(password)) {
            System.out.println("Welcome " + username);
        }
        else {
            System.out.println("ACCESS DENIED!");
        }
    }
}
