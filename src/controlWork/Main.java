package controlWork;

import controlWork.Login.LoginTask;
import controlWork.Armstrong.Armstrong;
import controlWork.EvenNumber.EvenNumber;
import controlWork.Fibonacci.Fibonacci;
import controlWork.Replace.Replace;
import controlWork.Reverse.Reverse;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Создать программу, которая логинит пользователя. На стартовом экране запрашиваете логин пароль. Если логин удачный, переходим на след экран. Если нет, выводим
ошибку. Пара логин-пароль храниться в переменных. После удачного логина выводим меню с 5 вариантами задач. Добавить обработку ошибок. Разложить задачи на методы
(плюсом будет разложение на классы). Все запушить в гит отдельным проэктом или папкой и скинуть мне мердж реквестом.
 */
// ДЗ№11
//B проекты ваших контрольных работ, добавить обработку исключений с помощью блоков try/catch/finally
//Сделайте обработку ввода логина и пароля.
//Добавить обработку ошибок для аргументов задач. Задачи из контрольной работы должны принимать данные с консоли. Т.е. если у вас задача на разворот строки, строку вы должны ввести с консоли.
//Использовать хотя бы одно свое исключение

public class Main {

    public static void main(String[] args) {

        int maxUsername = 30;
        int maxPassword = 8;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Username : ");
            String username = scanner.nextLine();

            if (username.length() <= 0 || username.length() > maxUsername) {
                throw new LoginException("Invalid username max length");
            }
            System.out.print("Enter Password : ");
            String password = scanner.nextLine();

            if (password.length() <= 0 || password.length() > maxPassword) {
                throw new LoginException("Invalid password max length");
            }

            LoginTask.validationAccess(password, username);

        } catch (LoginException exception) {
            System.out.println(exception.getMessage());
            System.exit(1);
        }

        boolean isExit = false;

        do {
            printMenu();
            try {
                String inputString = scanner.nextLine();
                int taskNum = Integer.parseInt(inputString);

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
                        throw new LoginException("Incorrect task number");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Invalid number input, try again");
            } catch (LoginException exception) {
                System.out.println(exception.getMessage());
            } catch (Exception exception) {
                System.out.println("Error: " + exception.getMessage());
                System.exit(1);
            }
        } while (!isExit);
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

