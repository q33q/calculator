package ru.kozhaev.entity;

import ru.kozhaev.enumeration.NumRoman;
import ru.kozhaev.exception.NotMathOperationException;
import ru.kozhaev.exception.WrongArgumentException;

public class Analyzer {
    protected int argFirst;
    protected int argSecond;
    protected String operation;
    protected boolean isNumRoman;

    public Analyzer(Parser parser) throws WrongArgumentException, NotMathOperationException {
        NumRoman numRoman = NumRoman.I;
        String argFirst = parser.getArgFirst().toUpperCase();
        String argSecond = parser.getArgSecond().toUpperCase();
        String operation = parser.getOperation();

        boolean notNumDigits = !isNumDigit(argFirst) || !isNumDigit(argSecond);
        boolean notNumRoman = !isNumRoman(argFirst) || !isNumRoman(argSecond);

        if (notNumDigits && notNumRoman) {
            throw new WrongArgumentException();
        }

        boolean notCorrectRangeArabicArgs = !isCorrectRangeArabicArg(argFirst) || !isCorrectRangeArabicArg(argSecond);
        boolean notCorrectRangeRomanArgs = !isCorrectRangeRomanArg(argFirst) || !isCorrectRangeRomanArg(argSecond);

        if (notCorrectRangeArabicArgs && notCorrectRangeRomanArgs) {
            throw new WrongArgumentException();
        }

        if (!isOperation(operation)) {
            throw new NotMathOperationException();
        }

        boolean isCorrectArabicArgs = isCorrectRangeArabicArg(argFirst) && isCorrectRangeArabicArg(argSecond);
        boolean isCorrectRomanArgs = isCorrectRangeRomanArg(argFirst) && isCorrectRangeRomanArg(argSecond);

        if (isCorrectArabicArgs && !isCorrectRomanArgs) {
            this.setArgFirst(Integer.parseInt(argFirst));
            this.setArgSecond(Integer.parseInt(argSecond));
        } else if (!isCorrectArabicArgs && isCorrectRomanArgs) {
            this.setArgFirst(numRoman.toArabic(argFirst));
            this.setArgSecond(numRoman.toArabic(argSecond));
            this.setIsNumRoman(true);
        }

        if (isOperation(operation)) {
            this.setOperation(operation);
        }

    }

    public int getArgFirst() {
        return argFirst;
    }

    public void setArgFirst(int argFirst) {
        this.argFirst = argFirst;
    }

    public int getArgSecond() {
        return argSecond;
    }

    public void setArgSecond(int argSecond) {
        this.argSecond = argSecond;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public boolean getIsNumRoman() {
        return isNumRoman;
    }

    public void setIsNumRoman(boolean numRoman) {
        isNumRoman = numRoman;
    }

    private boolean isNumDigit(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isNumRoman(String s) {
        return s.toUpperCase().matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    private boolean isCorrectRangeArabicArg(String s) {
        int sIntForm = 0;
        if (!isNumRoman(s) && isNumDigit(s)) {
            sIntForm = Integer.parseInt(s);
        }
        return sIntForm >= 1 && sIntForm <= 10;
    }

    private boolean isCorrectRangeRomanArg(String s) {
        int sIntForm = 0;
        if (isNumRoman(s)) {
            NumRoman numRoman = NumRoman.I;
            sIntForm = numRoman.toArabic(s);
        }
        return sIntForm >= 1 && sIntForm <= 10;
    }

    private boolean isOperation(String s) throws RuntimeException {
        return s.matches("[+\\-*/]");
    }

}
