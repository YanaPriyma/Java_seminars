// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package hw_seminar2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class task_1 {

    public static int[] sortArray(int[] array) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(task_1.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler sb = new FileHandler("LOG.txt");
        logger.addHandler(sb);
        SimpleFormatter sFormat = new SimpleFormatter();
        sb.setFormatter(sFormat);

        String text;
        int temp;
        int counter = 0;        
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                counter++;
                text = counter + "\n" + Arrays.toString(array) + "\n";
                logger.info(text);
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } return array;
    }

    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = {1, 299, 3, 10, 9, 100};
        sortArray(array);
    }
}