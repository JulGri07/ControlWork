package controlWork.Replace;

import controlWork.LoginException;

import java.util.Scanner;
/*
5. controlWork.Replace.Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль. Выводит новую строку на экран. Добавить обработку длины строки,
максимальная длина 30 символов. Строка может состоять из нескольких слов и любых символов)
 */
public class Replace {

    public static void main(String[] args) {

        try {
            doTask();
        } catch (LoginException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void replaceSymbol(String str) {
        System.out.println(str.replace("a", "@").replace("o", "0"));
    }

    public static void doTask () throws LoginException {

        System.out.println("Do task 5\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string: ");
        String str = scanner.nextLine();
        if (str.length()<1 || str.length()>20) {
            throw new LoginException("Invalid string length");
        }
        replaceSymbol(str);
    }

}
