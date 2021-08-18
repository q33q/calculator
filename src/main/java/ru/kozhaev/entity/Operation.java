package ru.kozhaev.entity;

import ru.kozhaev.enumeration.NumArabic;
import ru.kozhaev.exception.NegativeRomanException;

public class Operation {
    protected String result;

    public Operation(Analyzer analyzer) throws NegativeRomanException {
        int argFirst = analyzer.getArgFirst();
        int argSecond = analyzer.getArgSecond();
        String operation = analyzer.getOperation();

        switch (operation) {
            case "+":
                result = getSum(argFirst, argSecond);
                break;
            case "-":
                result = getMinus(argFirst, argSecond);
                break;
            case "*":
                result = getMultiply(argFirst, argSecond);
                break;
            case "/":
                result = getDivide(argFirst, argSecond);
                break;
            default:
                break;
        }

        boolean isNumRoman = analyzer.getIsNumRoman();
        if (isNumRoman) {
            NumArabic numArabic = NumArabic._1;
            assert result != null;
            if (Integer.parseInt(result) <= 0) {
                throw new NegativeRomanException();
            } else {
                this.setResult(numArabic.toNumRoman(Integer.parseInt(result)));
            }
        } else {
            this.setResult(result);
        }
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSum(int argFirst, int argSecond) {
        return String.valueOf(argFirst + argSecond);
    }

    public String getMinus(int argFirst, int argSecond) {
        return String.valueOf(argFirst - argSecond);
    }

    public String getMultiply(int argFirst, int argSecond) {
        return String.valueOf(argFirst * argSecond);
    }

    public String getDivide(int argFirst, int argSecond) {
        return String.valueOf(argFirst / argSecond);
    }
}
