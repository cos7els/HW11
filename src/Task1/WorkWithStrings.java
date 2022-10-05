package Task1;

public class WorkWithStrings {

    public static void isContainsABC(String string) throws ContainsABCException {
        if (string.toLowerCase().contains("abc")) {
            throw new ContainsABCException("The string contains abs sequency exception");
        } else {
            System.out.println("Not contains abc");
        }
    }

    public static void isStartFrom555(String string) throws StartFrom555Exception {
        if (string.startsWith("555")) {
            throw new StartFrom555Exception("The string starts from 555 sequency exception");
        } else {
            System.out.println("Not starts from 555");
        }
    }

    public static void isEndWith1a2b(String string) throws EndWith1A2BException {
        if (string.toLowerCase().endsWith("1a2b")) {
            throw new EndWith1A2BException("The string end with 1a2b sequency exception");
        } else {
            System.out.println("Not end with 1a2b");
        }
    }

}
