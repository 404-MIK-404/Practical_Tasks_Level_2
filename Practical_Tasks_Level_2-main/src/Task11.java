import java.util.Scanner;

public class Task11 {

    /**
    *
    * Теша шел по прямой улице, по обеим сторонам которой стояло ровно n одинаковых домов. Номера домов на улице выглядят так:

        1 |   | 6
        3 |   | 4
        5 |   | 2

    Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева.
    Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер дома на противоположной стороне.

    Пример:
    oppositeHouse(1, 3) ➞ 6

    oppositeHouse(2, 3) ➞ 5

    oppositeHouse(3, 5) ➞ 8

    oppositeHouse(5, 46) ➞ 88
    *
    **/


    private static int valueNumberHouse = 0;
    private static  int sizeStreet = 0;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Номер дома: ");
        valueNumberHouse = ui.nextInt();
        System.out.print("Длина улицы: ");
        sizeStreet = ui.nextInt();
        System.out.print("Результат: " + oppositeHouse(valueNumberHouse,sizeStreet));

    }

    private static int oppositeHouse(int needNumberHouse,int lengthStreet )
    {
        int count = 0;
        int result = 0;
        for (int i = 1; i <= lengthStreet * 2; i=i+2){
            if (needNumberHouse == i){
                result =  (lengthStreet * 2)-count;
                break;

            }else if (needNumberHouse == (lengthStreet * 2)-count){
                result = i;
                break;
            }
            count += 2;
        }
        return result;
    }


}
