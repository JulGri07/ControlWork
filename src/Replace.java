import java.util.Scanner;
/*
5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль. Выводит новую строку на экран. Добавить обработку длины строки,
максимальная длина 30 символов. Строка может состоять из нескольких слов и любых символов)
 */
public class Replace {

    public static void main(String[] args) {

        doTask();

    }
    static void replaceSymbol(String str) {

        if (str.length() > 30) {
            System.out.println("String is more than 30 symbols");
        } else {
           System.out.println(str.replace("a", "@").replace("o", "0"));
        }

    }
    public static void doTask () {

        System.out.println("Do task 5\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string: ");
        String str = scanner.nextLine();
        replaceSymbol(str);
    }

}
