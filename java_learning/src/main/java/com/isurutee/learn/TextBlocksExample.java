package com.isurutee.learn;

public class TextBlocksExample implements IExample{
    public void runExample() {
        // old syntax
        String textOld = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
        System.out.println(textOld);

        int age = 45;

        // new syntax
        String textNew = """
            {
              "name": "John Doe",
              "age": %s,
              "address": "Doe Street, 23, Java Town"
            }
            """.formatted(age);
        System.out.println(textNew);
        String textNewWithIndentation = """
                {
                  "name": "John Doe",
                  "age": %s,
                  "address": "Doe Street, 23, Java Town"
                }
            """.formatted(age);
        System.out.println(textNewWithIndentation);
    }
}
