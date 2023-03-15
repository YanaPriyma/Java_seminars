// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package hw_seminar3;

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) 
    {
        ArrayList<Integer> ar = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) 
        {
            ar.add(new Random().nextInt(1, 50));
        }
        System.out.println(ar);
        for (int i = ar.size() - 1; i >= 0; i--) 
        {
            if (ar.get(i) % 2 == 0) 
            {
                ar.remove(i);
            }
        }
        System.out.println(ar);
    }
    
}
