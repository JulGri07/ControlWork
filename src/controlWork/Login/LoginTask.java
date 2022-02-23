package controlWork.Login;

import controlWork.LoginException;

public class LoginTask {

    private static String Username = "Jul";
    private static String Password = "qwerty";


    static public boolean validationAccess(String password, String username) throws LoginException {
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Access Granted! Welcome!\n");
            return true;
        } else if (username.equals(Username)) {
            throw new LoginException("Invalid Password!");
        } else if (password.equals(Password)) {
            throw new LoginException("Invalid Username!");
        } else {
            throw new LoginException("Invalid Username & Password!");
        }
    }
}





