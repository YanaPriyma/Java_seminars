package hw_seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего

public class task1 {
    public static void addNumber(Map<String, ArrayList<Integer>> phoneBook) {
        System.out.println("Введите фамилию: ");
        Scanner iScanner = new Scanner(System.in, "cp866");
        String lastName = iScanner.nextLine();
        System.out.println("Введите номер: ");
        if (phoneBook.containsKey(lastName)) 
        {
            phoneBook.get(lastName).add(Integer.parseInt(iScanner.nextLine()));
        } 
        else 
        {
            ArrayList<Integer> phone = new ArrayList<>();
            phone.add(Integer.parseInt(iScanner.nextLine()));
            phoneBook.put(lastName, phone);
        }
        iScanner.close();
    }

    public static void output(Map<String, ArrayList<Integer>> phoneBook) {
        for (var item : phoneBook.entrySet()) 
        {
            System.out.printf("\n"+item.getKey() + ": ");
            for (int element : item.getValue()) 
            {
                System.out.printf(Integer.toString(element) + ", ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("Введите команду:\n1 - Добавить номер в записную книгу,\n" +
        "2 - Показать все контакты,\n" +
        "0 - Выйти ");
        Scanner iScanner = new Scanner(System.in, "cp866");
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        String answer = iScanner.nextLine();
        while (!answer.equals("0")) 
        {
            if (Integer.parseInt(answer) == 1)
                addNumber(phoneBook);
            if (Integer.parseInt(answer) == 2)
                output(phoneBook);
            System.out.println("Введите команду:\n1 - Добавить номер в записную книгу,\n" +
            "2 - Показать все контакты,\n" +
            "0 - Выйти ");
            answer = iScanner.nextLine();
        }
        iScanner.close();
    }
}
