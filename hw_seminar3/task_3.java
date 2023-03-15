// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

package hw_seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            ar.add(new Random().nextInt(1, 50));
        }
        System.out.println(ar);
        int min = Collections.min(ar);
        int max = Collections.max(ar);
        double avg = ar.stream().mapToDouble(a -> a).sum() / ar.size();
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + avg);
    }
}
