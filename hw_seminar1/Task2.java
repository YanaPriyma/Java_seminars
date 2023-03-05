package hw_seminar1;

// Задание 2. Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 2; i <=1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(i + " ");
            else flag = true;
        } 
        System.out.println();
    }
}
    

