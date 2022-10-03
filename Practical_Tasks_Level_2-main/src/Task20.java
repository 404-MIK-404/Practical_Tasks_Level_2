import java.util.Scanner;

/**
 *
 * Возвращает true, если сумма значений ASCII первой строки
 * совпадает с суммой значений ASCII второй строки,
 * в противном случае возвращает false.
 *
 *
 * Пример:
 * sameAscii("a", "a") ➞ true
 *
 * sameAscii("AA", "B@") ➞ true
 *
 * sameAscii("EdAbIt", "EDABIT") ➞ false
 *
 * */


public class Task20 {

    private static String symbolOne;
    private static String symbolTwo;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbolOne = ui.nextLine();
        System.out.print("Напишите текст: ");
        symbolTwo = ui.nextLine();
        System.out.print("Результат: " + sameAscii(symbolOne,symbolTwo));

    }

    private static boolean  sameAscii(String textOne,String textTwo)
    {
        int sumTextOne = textOne.chars().sum();
        int sumTextTwo = textTwo.chars().sum();
        return sumTextOne == sumTextTwo;
    }

}
