package ru.kozhaev.enumeration;

public enum NumRoman {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100);

    private final int numArabic;

    NumRoman(int numArabic) {
        this.numArabic = numArabic;
    }

    public int toArabic(String numRoman) {
        int result = 0;
        for (int i = 0; i < numRoman.length(); i += 1) {
            if (i == 0 || getNumArabic(numRoman.charAt(i)) <= getNumArabic(numRoman.charAt(i - 1)))
                result += getNumArabic(numRoman.charAt(i));
            else
                result += getNumArabic(numRoman.charAt(i)) - 2 * getNumArabic(numRoman.charAt(i - 1));
        }
        return result;
    }

    public int getNumArabic(char ch) {
        String strChar = Character.toString(ch);
        int result = -1;
        for (NumRoman val : NumRoman.values()) {
            if (val.toString().equals(strChar)) {
                result = val.numArabic;
            }
        }
        return result;
    }

}
