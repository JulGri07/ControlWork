package controlWork.Reverse;

import java.util.Scanner;

/*
3. controlWork.Reverse.Reverse (Напишите программу для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)
 */
public class Reverse {
    public static void main(String[] args) {

        doTask();

    }
    static String reverseString(String str) {

        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }
    public static void doTask () {

        System.out.println("Do task 3\n");
        System.out.println("Input a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("controlWork.Reverse.Reverse string is\n" + reverseString(str));
    }

}
