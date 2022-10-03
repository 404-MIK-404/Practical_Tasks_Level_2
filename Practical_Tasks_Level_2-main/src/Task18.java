import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
    Создайте функцию, которая принимает строку, проверяет,
    имеет ли она одинаковое количество x и o и возвращает либо true, либо false.



    Правила:
    - Возвращает логическое значение (true или false).
    - Верните true, если количество x и o одинаковы.
    - Верните false, если они не одинаковы.
    - Строка может содержать любой символ.
    - Если "x" и "o" отсутствуют в строке, верните true.

    Пример:
    getXO("ooxx") ➞ true

    getXO("xooxx") ➞ false

    getXO("ooxXm") ➞ true
    // Case insensitive.

    getXO("zpzpzpp") ➞ true
    // Returns true if no x and o.

    getXO("zzoo") ➞ false

 **/



public class Task18 {

    private static String symbol;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbol = ui.nextLine();
        System.out.print("Результат: " + getXO(symbol));

    }

    private static boolean getXO(String symbol)
    {
        symbol = symbol.toLowerCase(Locale.ROOT);
        List<Character> chars = symbol.chars().mapToObj(e->(char)(e)).collect(Collectors.toList());
        Map<Character,Long> arr = chars.stream().filter(e -> e == 'x' || e == 'o').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        if (!arr.containsKey('x') && !arr.containsKey('o')){
            return true;
        }
        else if (!arr.containsKey('x') || !arr.containsKey('o')){
            return false;
        }
        else if (!arr.get('x').equals(arr.get('o'))){
            return false;
        }
        return true;
    }

}
