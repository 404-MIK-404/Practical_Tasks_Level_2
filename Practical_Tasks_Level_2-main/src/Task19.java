import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
	Напишите функцию, которая находит слово "бомба" в данной строке.
	Ответьте "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет".

    Пример:
    bomb("There is a bomb.") ➞ "DUCK!"

    bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"

    bomb("This goes boom!!!") ➞ "Relax, there's no bomb."

    Примечание:
    Строка "бомба" может появляться в разных случаях символов
    (например, в верхнем, нижнем регистре, смешанном).

 **/


public class Task19 {

    private static String symbol;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbol = ui.nextLine();
        System.out.print("Результат: " + findBomb(symbol));

    }

    private static String  findBomb(String symbol)
    {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(symbol.toLowerCase(Locale.ROOT).split("[ ]|[!]|[,]|[?]|[.]")));
        if (arrayList.contains("bomb")){
            return "DUCK!";
        }
        return "Relax, there's no bomb";
    }
}
