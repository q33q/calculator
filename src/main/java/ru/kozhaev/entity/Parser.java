package ru.kozhaev.entity;

import ru.kozhaev.exception.WrongMathFormatException;

import java.util.regex.Pattern;

public class Parser {
    protected String argFirst;
    protected String argSecond;
    protected String operation;

    public Parser(Expression expression) throws Exception {
        Pattern pattern = Pattern.compile(" ");
        String[] arrayLexeme = pattern.split(expression.getInput());

        try {
            this.setArgFirst(arrayLexeme[0]);
            this.setOperation(arrayLexeme[1]);
            this.setArgSecond(arrayLexeme[2]);
        } catch (Exception e) {
            throw new WrongMathFormatException();
        }

        if (arrayLexeme.length > 3) {
            throw new WrongMathFormatException();
        }

    }

    protected String getArgFirst() {
        return argFirst;
    }

    private void setArgFirst(String argFirst) {
        this.argFirst = argFirst;
    }

    protected String getArgSecond() {
        return argSecond;
    }

    private void setArgSecond(String argSecond) {
        this.argSecond = argSecond;
    }

    protected String getOperation() {
        return operation;
    }

    private void setOperation(String operation) {
        this.operation = operation;
    }
}
