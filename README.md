# Консольное приложение "Калькулятор"

## Описание
Приложение считывает из консоли введенные пользователем арифметические операции и выводить в консоль результат их выполнения.

## Возможности
1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. **Данные передаются в одну строку (см. пример ниже)!**
1. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
1. Калькулятор принимает на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
1. Калькулятор умеет работать только с целыми числами.
1. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор  выбрасывает исключение и прекращает свою работу.
1. При вводе римских чисел, ответ выведется римскими цифрами, соответственно, при вводе арабских - ответ выводится арабскими.
1. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
1. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
1. Результатом операции деления является целое число, остаток отбрасывается.
1. Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль. Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение.
1. Для завершения работсы с калькулятором достаточно ввесли английсуцю букву **e** и нажать Enter.

## Пример работы программы

Input
```java
1 + 2
```
Output
```java
3
```

Input
```java
VI / III
```
Output
```java
II
```

Input
```java
I - II
```
Output
```java
В римской системе нет отрицательных и нулевых значений
```

Input
```java
I + 1
```
Output
```java
Неправильный аргумент
```

Input
```java
1
```
Output
```java
Формат математической операции не удовлетворяет заданию -
два операнда и один оператор (+, -, /, *), разделенный пробелами
```

Input
```java
1 + 2 + 3
```
Output
```java
Формат математической операции не удовлетворяет заданию -
два операнда и один оператор (+, -, /, *), разделенный пробелами
```

<!-- ## Как запустить -->
<!-- В консоли перейти в директорию ***\calculator\target** с файлом **calculator-0.1.0.jar** и выполнить команду: -->

<!-- ```java -->
<!-- java -jar calculator-0.1.0.jar -->
<!-- ``` -->

## Стек технологий
* Windows
* IntelliJ IDEA
* Java
* Maven

### Дополнения
Конвертация римских цифр в арабские и обратно с частичным изменением исходного кода для использования в перечислении ENUM

[Конвертер](https://coding.tools/ru/numbers-to-roman-numerals)

## Автор
Кожаев Павел

## Лицензия
[MIT](https://choosealicense.com/licenses/mit/)