import java.util.Scanner;

public class Task13 {
    /**
        Создайте функцию, которая принимает два аргумента: исходную цену и процент скидки в виде целых чисел и возвращает конечную цену после скидки.

        Пример:

        discount(1500, 50) ➞ 750

        discount(89, 20) ➞ 71.2

        discount(100, 75) ➞ 25

     **/



    private static float price;
    private static float discount;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Цена продукта: ");
        price = ui.nextFloat();
        System.out.print("Скидка на данный продукт: ");
        discount = ui.nextFloat();
        System.out.print("Цена со скидкой: " + discount(price,discount));

    }

    private static float discount(float price,float discount)
    {
        return price - ((price * discount)/100);
    }

}
