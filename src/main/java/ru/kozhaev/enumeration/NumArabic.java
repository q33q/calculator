package ru.kozhaev.enumeration;

public enum NumArabic {
    _100("C"),
    _90("XC"),
    _50("L"),
    _40("XL"),
    _10("X"),
    _9("IX"),
    _5("V"),
    _4("IV"),
    _1("I");

    private final String numRoman;

    NumArabic(String numRoman) {
        this.numRoman = numRoman;
    }

    public String getNumRoman() {
        return numRoman;
    }

    public String toNumRoman(int numArabic) {
        StringBuilder result = new StringBuilder();
        for (NumArabic val : NumArabic.values()) {
            int valInt = Integer.parseInt((val.toString().replaceAll("_", "")));
            while (numArabic >= valInt) {
                numArabic -= valInt;
                result.append(val.getNumRoman());
            }
        }
        return result.toString();
    }

}
