package controlWork.Reverse;

import controlWork.LoginException;

import java.util.Scanner;

/*
3. controlWork.Reverse.Reverse (Напишите программу для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)
 */
public class Reverse {
    public static void main(String[] args) {
        try {
            doTask();
        } catch (LoginException exception) {
            System.out.println(exception.getMessage());
        }
    }
    static String reverseString(String str) {

        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }
    public static void doTask () throws LoginException {

        System.out.println("Do task 3\n");
        System.out.println("Input a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length()<1 || str.length()>20) {
            throw new LoginException("Invalid string length");
        }

        System.out.println("Reverse string is\n" + reverseString(str));
    }

}
