package ru.kozhaev;

import ru.kozhaev.entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        Demo demo = new Demo();
        demo.startDemo();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while (!(input = br.readLine()).equals("e")) {
                Operation operation = new Operation(
                                            new Analyzer(
                                                    new Parser(
                                                            new Expression(input))));
                System.out.printf("%s\n\n",
                        operation.getResult());
            }
            System.out.println("Программа успешно завершена!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

