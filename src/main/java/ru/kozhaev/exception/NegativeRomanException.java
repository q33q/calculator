package ru.kozhaev.exception;

public class NegativeRomanException extends Exception{
    public NegativeRomanException() {
        System.out.println("В римской системе нет отрицательных и нулевых значений");
        System.exit(111);
    }
}
