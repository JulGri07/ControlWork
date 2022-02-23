package controlWork.EvenNumber;

import java.util.NoSuchElementException;
import java.util.Scanner;
/*
1. Even Number (Напишите программу которая определяет, является ли число четным или нет. Проверять только целые числа. Добавить обработку ошибок с описанием.)
 */
public class EvenNumber {
    public static void main(String[] args) {

        doTask();

    }

    static void oddOrEven(int num){
        if ( num % 2 == 0 )
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
    public static void doTask () {

        System.out.println("Do task 1\n");
        boolean taskEnd = false;
        Scanner scanner = new Scanner(System.in);
        while (!taskEnd) {
            try {
                System.out.println("Enter some number: ");

                String inputString = scanner.nextLine();
                int num = Integer.parseInt(inputString);

                oddOrEven(num);
                taskEnd = true;
            } catch (NumberFormatException exception) {
                System.out.println("That not a number! \nPlease enter number");
            }
        }
    }

}

