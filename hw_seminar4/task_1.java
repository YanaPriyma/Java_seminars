// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package hw_seminar4;

import java.util.Arrays;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Object> ar = new LinkedList<>(Arrays.asList("текст", "для примера"));
        System.out.println(ar);
        System.out.println(ar_reverse(ar));
    }

    public static Object ar_reverse (LinkedList<Object> ar_rev) {
        for (int i = 0; i < ar_rev.size(); i++) {
            ar_rev.add(ar_rev.size() - i, ar_rev.get(0));
            ar_rev.remove();
        }
        return ar_rev;
    }
}

