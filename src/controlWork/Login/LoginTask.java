package controlWork.Login;

public class LoginTask {

    private static String Username = "Jul";
    private static String Password = "qwerty";


    static public boolean validationAccess(String password, String username) {
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Access Granted! Welcome!\n");
            return true;
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
            return false;
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
            return false;
        } else {
            System.out.println("Invalid Username & Password!");
            return false;
        }
    }
}





