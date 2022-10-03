import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


  /**
    Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и возвращает количество целых чисел, имеющих одинаковое значение.

    Пример:

    equal(3, 4, 3) ➞ 2

    equal(1, 1, 1) ➞ 3

    equal(3, 4, 1) ➞ 0

 **/



public class Task15 {


    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        ArrayList<Integer> arrayValue = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            System.out.print("Значение №" + i +": " );
            int valuePrint = ui.nextInt();
            arrayValue.add(valuePrint);
        }
        System.out.println("\nИсходный массив: " + arrayValue);
        System.out.println("Результат: " + equal(arrayValue));

    }

    private static int equal(ArrayList<Integer> values)
    {
        long res = values.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .values().stream().max(Comparator.comparing(a->a)).get();
        if (res == 1){
            return 0;
        }
        return (int) res;

    }

}
