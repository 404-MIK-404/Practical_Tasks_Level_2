import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task17 {

    /**
        Вы наняли трех программистов и (надеюсь) платите им. Создайте функцию, которая принимает три числа (почасовая заработная плата каждого программиста) и возвращает разницу между самым высокооплачиваемым программистом и самым низкооплачиваемым.

        Пример:

        programmers(147, 33, 526) ➞ 493

        programmers(33, 72, 74) ➞ 41

        programmers(1, 5, 9) ➞ 8


     **/


    private static int value;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        ArrayList<Integer> arrayValue = new ArrayList<>();
        for (int i =0;i < 3;i++)
        {
            while(true)
            {
                System.out.print("Зарплата программиста под номером №" + i + " ");
                value = ui.nextInt();
                if (value > 0)
                {
                    arrayValue.add(value);
                    break;
                }
            }
        }
        System.out.println("\nИсходный массив:" + arrayValue );
        System.out.println("Результат: " + programmers(arrayValue));

    }

    private static int programmers(ArrayList<Integer> value)
    {
        int result = value.stream().collect(Collectors.reducing(Integer::max)).get()
                - value.stream().collect(Collectors.reducing(Integer::min)).get();
        return result;
    }


}
