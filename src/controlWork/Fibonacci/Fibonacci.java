package controlWork.Fibonacci;

import controlWork.LoginException;

import java.util.Scanner;

/*
4. controlWork.Fibonacci.Fibonacci (Рассчитать первых 20 чисел Фиббоначии вывести их на экран)
 */
public class Fibonacci {


    public static int max_num = 20; //

    public static void main(String[] args) {

        doTask();

    }

    public static void printNextPhibonachi(double prev1, double prev2, int num, int max_num) {
        double cur = 1;
        if (num >= 3) {
            cur = prev1 + prev2;
        }
        System.out.printf("Num % 3d is % 12.0f\n", num, cur);
        if (num < max_num) {
            printNextPhibonachi(prev2, cur, num + 1, max_num);
        }
    }
    public static void doTask ()  {

        System.out.println("Do task 4\n");

        Scanner scanner = new Scanner(System.in); // специально добавляю ввод с консоли

        try {
            System.out.println("Enter the number: ");
            String inputString = scanner.nextLine();
            int num = Integer.parseInt(inputString);
            if (num < 5 || num >20 ){
                throw new LoginException("Num can be in 5..20");
            }

            printNextPhibonachi(1, 1, 1, num);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid int number");
        } catch (LoginException exception) {
            System.out.println(exception.getMessage());
        }


    }

}
