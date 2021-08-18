package ru.kozhaev.exception;

public class WrongMathFormatException extends Exception{
    public WrongMathFormatException() {
        System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *), разделенный пробелами");
        System.exit(444);
    }
}
