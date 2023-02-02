package com.isurutee.learn.SwitchExpressions;

import com.isurutee.learn.common.IExample;

public class SwitchExpressionsExample implements IExample {

    enum Employee {
        MANAGER,
        ENGINEER,
        JANITOR,
        ELECTRICIAN,
        COOK,
        SENIOR_MANAGER,
        SENIOR_ENGINEER
    }

    @Override
    public void runExample() {
        // old syntax
        System.out.println("---------------------------Switch Expression Example--------------------------");
        System.out.println("Old Syntax");
        for (Employee employee : Employee.values()) {
            switch (employee) {
                case SENIOR_ENGINEER, SENIOR_MANAGER:
                    System.out.printf("Employee %s has %s access%n", employee, "privileged");
                    break;
                case ENGINEER, MANAGER:
                    System.out.printf("Employee %s has %s access%n", employee, "basic");
                    break;
                default:
                    System.out.printf("Employee %s has %s access%n", employee, "no");
            }
        }
        System.out.println("\nJava 17 Syntax - Switch expressions");
        for (Employee employee : Employee.values()) {
            switch (employee) {
                case SENIOR_ENGINEER, SENIOR_MANAGER ->
                        System.out.printf("Employee %s has %s access%n", employee, "privileged");
                case ENGINEER, MANAGER -> System.out.printf("Employee %s has %s access%n", employee, "basic");
                default -> System.out.printf("Employee %s has %s access%n", employee, "no");
            }
        }

        System.out.println("\nJava 17 Syntax - Return value from switch expression");
        for (Employee employee : Employee.values()) {
            String expressionOutput = switch (employee) {
                case SENIOR_ENGINEER, SENIOR_MANAGER -> "Employee %s has %s access".formatted(employee, "privileged");
                case ENGINEER, MANAGER -> "Employee %s has %s access".formatted(employee, "basic");
                default -> {
                    System.out.println("Unauthorized access detected");
                    yield "Employee %s has %s access".formatted(employee, "no");
                }
            };
            System.out.println(expressionOutput);
        }
    }
}
