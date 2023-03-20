package hw_seminar4;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Object> ar = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(ar);
       
        System.out.println("enqueue(помещает элемент в конец очереди): ");
        System.out.println("Введите 'элемент': ");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        String el = iScanner.nextLine();
        System.out.println(ar.offer(el));
        iScanner.close();
        System.out.println(ar);

        System.out.println("dequeue: (возвращает первый элемент из очереди и удаляет его)");
        System.out.println(ar.poll());
        System.out.println(ar);
        

        System.out.println("first: (возвращает первый элемент из очереди, не удаляя)");
        System.out.println(ar.peek());
        System.out.println(ar);
    }
}