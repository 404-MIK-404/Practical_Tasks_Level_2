import java.util.*;

public class Task14 {

    /**
    	Создайте функцию, которая принимает массив и возвращает разницу между наибольшим и наименьшим числами.

        Пример:

        differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
        // Smallest number is -50, biggest is 32.

        differenceMaxMin([44, 32, 86, 19]) ➞ 67
        // Smallest number is 19, biggest is 86.


     **/


    private static int value;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество символов в массиве: ");
        value = ui.nextInt();
        int[] mas = new int[value];
        for (int i =0;i < mas.length;i++)
        {
            mas[i] = (int) Math.round((Math.random() * 100) - 30);
        }
        System.out.print("\n Результат: " + differenceMaxMin(mas));

    }

    private static float differenceMaxMin(int[] mas)
    {
        OptionalInt max = Arrays.stream(mas).max();
        OptionalInt min = Arrays.stream(mas).min();
        System.out.println(Arrays.toString(mas));
        System.out.print("\nМаксимальное значение: " + max.getAsInt());
        System.out.print("\nМинимальное значение: " + min.getAsInt());
        return max.getAsInt() - min.getAsInt();
    }

}
