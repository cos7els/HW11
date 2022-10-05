package Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter the string: ");
                String string = in.nextLine();
                WorkWithStrings.isContainsABC(string);
                WorkWithStrings.isStartFrom555(string);
                WorkWithStrings.isEndWith1a2b(string);
            } catch (ContainsABCException | EndWith1A2BException | StartFrom555Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Do you want exit? y/n: ");
        } while (!in.nextLine().equalsIgnoreCase("y"));
        in.close();
    }

}
