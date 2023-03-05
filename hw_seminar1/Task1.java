package hw_seminar1;
import java.util.Scanner;

// Задача 1
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in, "Cp866");
        int n = scanner.nextInt();

        int triangle = 0;
        for (int i = 1; i <= n; i++) {
            triangle += i;
        }
        System.out.println("Треугольное число => " + triangle);

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! => " + factorial);
    }
}
