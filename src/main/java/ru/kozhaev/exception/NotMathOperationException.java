package ru.kozhaev.exception;

public class NotMathOperationException extends Exception{
    public NotMathOperationException() {
        System.out.println("Строка не является математической операцией");
        System.exit(333);
    }
}
