package Task2;

public class Registrator {

    public static void register(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        login(login);
        password(password, confirmPassword);
    }

    private static void login(String login) throws WrongLoginException {
        if (login.length() >= 20 & login.contains(" ")) {
            throw new WrongLoginException("Wrong login, login is too long and login contains space symbols");
        } else if (login.length() >= 20) {
            throw new WrongLoginException("Wrong login, your login is too long");
        } else if (login.contains(" ")) {
            throw new WrongLoginException("Wrong login, your login contains space symbol");
        } else {
            System.out.println("Login is OK");
        }
    }

    private static void password(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password, password and confirm password is not equals");
        } else if (password.length() >= 20 & password.contains(" ") & !password.replaceAll("\\D+", "").matches("\\d+")) {
            throw new WrongPasswordException("Wrong password, password is too long, contains space symbols and not contains number");
        } else if (password.length() >= 20 & password.contains(" ")) {
            throw new WrongPasswordException("Wrong password, password is too long and contains space symbols");
        } else if (password.length() >= 20 & !password.replaceAll("\\D+", "").matches("\\d+")) {
            throw new WrongPasswordException("Wrong password, password is too long and not contains number");
        } else if (password.contains(" ") & !password.replaceAll("\\D+", "").matches("\\d+")) {
            throw new WrongPasswordException("Wrong password, password contains space symbols and not contains number");
        } else if (password.length() >= 20) {
            throw new WrongPasswordException("Wrong password, password is too long");
        } else if (password.contains(" ")) {
            throw new WrongPasswordException("Wrong password, password contains space symbols");
        } else if (!password.replaceAll("\\D+", "").matches("\\d+")) {
            throw new WrongPasswordException("Wrong password, password is not contains number");
        } else {
            System.out.println("Password is OK");
        }
    }

}
