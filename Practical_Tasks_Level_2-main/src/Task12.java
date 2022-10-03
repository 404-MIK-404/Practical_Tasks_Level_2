import java.util.Scanner;

public class Task12 {

    private static String name;

    /**
     *
     * Создайте метод, который принимает строку (имя и фамилию человека)
     * и возвращает строку с заменой имени и фамилии.
     *
     * Пример:
     * nameShuffle("Donald Trump") ➞ "Trump Donald"
     *
     * nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
     *
     * nameShuffle("Seymour Butts") ➞ "Butts Seymour"
     *
     */



    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите имя и фамилию человека: ");
        name = ui.nextLine();
        System.out.print("Результат: " + nameShuffle(name));

    }

    private static String nameShuffle(String name)
    {
        String[] array = name.split(" ");
        if (array.length != 2){
            return "fail";
        }
        else {
            String temp = array[1];
            array[1] = array[0];
            array[0] = temp;
        }
       return array[0] + " " + array[1];
    }
}
