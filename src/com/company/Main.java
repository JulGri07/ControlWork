package com.company;

import controlWork.Login.LoginTask;
import controlWork.Armstrong.Armstrong;
import controlWork.EvenNumber.EvenNumber;
import controlWork.Fibonacci.Fibonacci;
import controlWork.Replace.Replace;
import controlWork.Reverse.Reverse;

import java.util.Scanner;

/*
Создать программу, которая логинит пользователя. На стартовом экране запрашиваете логин пароль. Если логин удачный, переходим на след экран. Если нет, выводим
ошибку. Пара логин-пароль храниться в переменных. После удачного логина выводим меню с 5 вариантами задач. Добавить обработку ошибок. Разложить задачи на методы
(плюсом будет разложение на классы). Все запушить в гит отдельным проэктом или папкой и скинуть мне мердж реквестом.
 */
public class Main {

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

        if (!LoginTask.validationAccess(password, username)) {
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

    public static void printMenu() {
        System.out.println(" ");
        System.out.println("1. Even Number");
        System.out.println("2. Armstrong");
        System.out.println("3. controlWork.Reverse.Reverse");
        System.out.println("4. controlWork.Fibonacci.Fibonacci");
        System.out.println("5. controlWork.Replace.Replace");
        System.out.println("0. Exit\n");
        System.out.print("Choose your destiny: ");
    }
}

