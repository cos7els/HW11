package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter the login: ");
                String login = in.nextLine();
                System.out.print("Enter the password: ");
                String password = in.nextLine();
                System.out.print("Confirm the password: ");
                String confirmPassword = in.nextLine();
                Registrator.register(login, password, confirmPassword);
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Do you want exit? y/n: ");
        } while (!in.nextLine().equalsIgnoreCase("y"));
        in.close();
    }

}
