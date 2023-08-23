import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] usernames = {"Admin", "User1", "User2", "User3", "User4"};
        String[] passwords = {"Password", "123456","qwerty", "abcdef", "secret"};
        int maxAttempts = 3;
        int attempts = 0;

        Scanner check = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String enteredUsername = check.nextLine();

        int userIndex = -1;
        for (int i = 0; i < usernames.length; i++) {
            if(enteredUsername.equalsIgnoreCase(usernames[i])) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            while (attempts < maxAttempts) {
                System.out.print("Enter password: ");
                String enteredPassword = check.nextLine();

                if (enteredPassword.equals(passwords[userIndex])) {
                    System.out.println("Welcome " + usernames[userIndex]);
                    break;
                } else {
                    attempts++;
                    System.out.println("Incorrect password!");
                }
            }
        } else {
            System.out.println("Username not found.");
        }

        if(attempts >= maxAttempts){
            System.out.println("ACCESS DENIED!");
        }

        check.close();
    }
}