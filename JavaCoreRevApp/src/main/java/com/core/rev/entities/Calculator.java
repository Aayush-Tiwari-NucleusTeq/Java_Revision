package com.core.rev.entities;
import java.util.Scanner;

public class Calculator {
    public static void master() {
        Scanner scanner = new Scanner(System.in);

        // Taking User Input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // If-Else Condition (Eligibility Check)
        if (age < 18) {
            System.out.println("Sorry " + name + ", you are underage.");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Hello " + name + ", you are an adult.");
        } else {
            System.out.println("Hello " + name + ", you are a senior citizen.");
        }

        // Switch-Case Example (Simple Calculator)
        System.out.println("\nChoose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

        // For Loop Example (Counting to 5)
        System.out.println("\nCounting using For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // While Loop Example (Even Numbers)
        System.out.println("\n\nEven numbers from 1 to 10 using While Loop:");
        int num = 1;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }

        scanner.close();
    }
}

