// задание3. Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package hw_seminar1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.printf("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.printf("Введите знак операции на выбор + - * / :");
        String operation = scanner.next();
        scanner.close();
        int result; 
        
        if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println(num1 + " + " +  num2 + " = " + result);
        }
        if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println(num1 + " - " +  num2 + " = " + result);
        }
        if (operation.equals("*")) {
            result = num1 * num2;
            System.out.println(num1 + " * " +  num2 + " = " + result);
        }
        if (operation.equals("/")) {
            result = num1 / num2;
            System.out.println(num1 + " / " +  num2 + " = " + result);
        }
    }
}
