# Практические задачи, уровень 2/6
Сделал Коршунов Михаил из группы БФИ1801


Список задач для этого уровня:

+ ## Теша шел по прямой улице, по обеим сторонам которой стояло ровно n одинаковых домов. Номера домов на улице выглядят так: ##

1 |     | 6

3 |     | 4

5 |     | 2

Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева.

Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер дома на противоположной стороне.

Пример:
```
oppositeHouse(1, 3) ➞ 6

oppositeHouse(2, 3) ➞ 5

oppositeHouse(3, 5) ➞ 8

oppositeHouse(5, 46) ➞ 88
```


+ ##	Создайте метод, который принимает строку (имя и фамилию человека) и возвращает строку с заменой имени и фамилии.##

Пример:
```
nameShuffle("Donald Trump") ➞ "Trump Donald"

nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"

nameShuffle("Seymour Butts") ➞ "Butts Seymour"
```


+ ##	Создайте функцию, которая принимает два аргумента: исходную цену и процент скидки в виде целых чисел и возвращает конечную цену после скидки.##

Пример:
```
discount(1500, 50) ➞ 750

discount(89, 20) ➞ 71.2

discount(100, 75) ➞ 25
```


+ ##	Создайте функцию, которая принимает массив и возвращает разницу между наибольшим и наименьшим числами.##

Пример:
```
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.
```


+ ##	Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и возвращает количество целых чисел, имеющих одинаковое значение.##

Пример:
```
equal(3, 4, 3) ➞ 2

equal(1, 1, 1) ➞ 3

equal(3, 4, 1) ➞ 0
```


+ ##	Создайте метод, который принимает строку в качестве аргумента и возвращает ее в обратном порядке.##

Пример:
```
reverse("Hello World") ➞ "dlroW olleH"

reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"
```

+ ##	Вы наняли трех программистов и (надеюсь) платите им. Создайте функцию, которая принимает три числа (почасовая заработная плата каждого программиста) и возвращает разницу между самым высокооплачиваемым программистом и самым низкооплачиваемым. ##

Пример:
```
programmers(147, 33, 526) ➞ 493

programmers(33, 72, 74) ➞ 41

programmers(1, 5, 9) ➞ 8
```


+ ##	Создайте функцию, которая принимает строку, проверяет, имеет ли она одинаковое количество x и o и возвращает либо true, либо false. ##

Правила:

- Возвращает логическое значение (true или false).
- Верните true, если количество x и o одинаковы.
- Верните false, если они не одинаковы.
- Строка может содержать любой символ.
- Если "x" и "o" отсутствуют в строке, верните true.

Пример:
```
getXO("ooxx") ➞ true

getXO("xooxx") ➞ false

getXO("ooxXm") ➞ true
// Case insensitive.

getXO("zpzpzpp") ➞ true
// Returns true if no x and o.

getXO("zzoo") ➞ false
```


+ ##	Напишите функцию, которая находит слово "бомба" в данной строке. Ответьте "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет". ##

Пример:
```
bomb("There is a bomb.") ➞ "DUCK!"

bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"

bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
```

Примечание: 
Строка "бомба" может появляться в разных случаях символов (например, в верхнем, нижнем регистре, смешанном).



+ ##	Возвращает true, если сумма значений ASCII первой строки совпадает с суммой значений ASCII второй строки, в противном случае возвращает false.##

Пример:
```
sameAscii("a", "a") ➞ true

sameAscii("AA", "B@") ➞ true

sameAscii("EdAbIt", "EDABIT") ➞ false
```
