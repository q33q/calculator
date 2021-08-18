package ru.kozhaev.exception;

public class WrongArgumentException extends Exception{
    public WrongArgumentException() {
        System.out.println("Неправильный аргумент");
        System.exit(333);
    }
}
