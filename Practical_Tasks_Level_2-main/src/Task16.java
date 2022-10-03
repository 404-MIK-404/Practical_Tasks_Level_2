import java.util.Scanner;

public class Task16 {


    /**
        Создайте метод, который принимает строку в качестве аргумента и возвращает ее в обратном порядке.

        Пример:
        reverse("Hello World") ➞ "dlroW olleH"

        reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

        reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"

     **/

    private static String symbol;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbol = ui.nextLine();
        System.out.println("Результат: " + reverse(symbol));

    }

    private static String reverse(String symbol)
    {
        /*
        1 вариант решения
        String result = "";
        for (int i = 0; i < symbol.length();i++)
        {
            result = symbol.charAt(i) + result;
        }

        */

        //2 вариант решения
        StringBuilder text = new StringBuilder(symbol);
        text.reverse();
        return text.toString();
    }

}
