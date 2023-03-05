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
        System.out.print("Введите число n: ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        int triangle = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangle += i;
            factorial *= i;
        }

        System.out.println("Треугольное число => " + triangle);
        System.out.println("n! => " + factorial);
    }
}
