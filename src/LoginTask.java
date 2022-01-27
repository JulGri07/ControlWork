import java.util.Scanner;

/*
Создать программу, которая логинит пользователя. На стартовом экране запрашиваете логин пароль. Если логин удачный, переходим на след экран. Если нет, выводим
ошибку. Пара логин-пароль храниться в переменных. После удачного логина выводим меню с 5 вариантами задач. Добавить обработку ошибок. Разложить задачи на методы
(плюсом будет разложение на классы). Все запушить в гит отдельным проэктом или папкой и скинуть мне мердж реквестом.
 */

public class LoginTask {

    private static String Username = "Jul";
    private static String Password = "qwerty";

    public static void main(String[] args) {

        int maxUsername = 30;
        int maxPassword = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = scanner.nextLine();

        if (username.length() <=0 || username.length() > maxUsername) {
            System.out.println("Invalid username max length");
            System.exit(1);
        }
        System.out.print("Enter Password : ");
        String password = scanner.nextLine();

        if (password.length() <=0 || password.length() > maxPassword) {
            System.out.println("Invalid password max length");
            System.exit(1);
        }

        if (!validationAccess(password, username)) {
            System.exit(1);
        }
        boolean isExit = false;
        do {
            printMenu();
            int taskNum = scanner.nextInt();
            switch (taskNum) {
                case 1:
                    EvenNumber.doTask();
                    break;
                case 2:
                    Armstrong.doTask();
                    break;
                case 3:
                    Reverse.doTask();
                    break;
                case 4:
                    Fibonacci.doTask();
                    break;
                case 5:
                    Replace.doTask();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Incorrect task number");
            }

        } while (!isExit);
    }

    static boolean validationAccess(String password, String username) {
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
    public static void printMenu() {
        System.out.println(" ");
        System.out.println("1. Even Number");
        System.out.println("2. Armstrong");
        System.out.println("3. Reverse");
        System.out.println("4. Fibonacci");
        System.out.println("5. Replace");
        System.out.println("0. Exit\n");
        System.out.print("Choose your destiny: ");
    }
}





