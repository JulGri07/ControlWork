package controlWork.Armstrong;

import java.util.InputMismatchException;
import java.util.Scanner;

 /*
2. Armstrong (Напишите программу для проверки является ли введенное число - числом Армстронга. Число Армстронга это число, значение которого равно сумме цифр, из
которых оно состоит, возведенных в степень, равную количеству цифр в этом числе. Как пример - число 371:
371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
Если у вас число четырехзначное:
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208)
 */

    public class Armstrong {
        public static void main(String[] args) {

            doTask();
        }

        public static int numDigits(int num) {
            int result = 0;
            do {
                result ++;
                num = num / 10;
            } while (num > 1);
            return result;
        }

        public static boolean isArmstrong(int num) {
            int numDigits = numDigits(num);
            int result = 0;
            int numTemp = num;

            do {
                int lastDigit = numTemp % 10;
                result = result + (int)Math.pow(lastDigit, numDigits);
                numTemp = numTemp / 10;
            } while (numTemp > 1);

            return num == result;
        }

        public static void doTask () {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Do task 2\n");
            System.out.print("Input integer: ");

            try {
                String inputString = scanner.nextLine();
                int num = Integer.parseInt(inputString);

                System.out.println("Num " + num + (isArmstrong(num) ? " is " : " is not ") + "Armstrong number");
            } catch (NumberFormatException exception){
                System.out.println("That not an int number!");
            }



        }
    }

