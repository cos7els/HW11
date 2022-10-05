package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the login: ");
            String login = in.nextLine();
            System.out.print("Enter the password: ");
            String password = in.nextLine();
            System.out.print("Confirm the password: ");
            String confirmPassword = in.nextLine();
            Registrator.register(login, password, confirmPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
