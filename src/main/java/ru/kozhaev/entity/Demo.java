package ru.kozhaev.entity;

public class Demo {

    public void startDemo() throws Exception {
        String[] arrDemo = {
// валидные данные
                "1 + 2",
                "1 - 2",
                "10 - 2",
                "3 * 2",
                "1 / 2",
                "5 / 2",
                "6 / 2",

                "I + II",
                "X - II",
                "III * II",
                "I * II",
                "V / II",
                "VI / II",

// невалидные данные
//                "I - II",
//                "I + 1",
//                "1",
//                "1 + 2 + 3",
//                "15 + 2",
//                "5 + a"
        };

        for (String val : arrDemo) {
            Operation operation = new Operation(
                    new Analyzer(
                            new Parser(
                                    new Expression(val))));
            System.out.printf("%s\n%s\n\n",
                    val,
                    operation.getResult());
        }
    }
}
