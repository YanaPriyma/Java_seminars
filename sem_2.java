// Дано четное число N (>0) и символы с1 и с2. Написать метод, который вернет строку длины N,
//  которая состоит из чередующихся символов с1 и с2, начиная с с1.
// import java.util.Scanner;

// public class sem_2 {
    // public static String builders(String a, String b, int N) {
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < N/2; i++) {
    //     sb.append(a);
    //     sb.append(b);
    // }
    // return sb.toString();
    
    // }
    
    // public static void main(String[] args) {
    // System.out.printf("Введите число N: ");
    // Scanner iScanner = new Scanner(System.in);
    // int N = iScanner.nextInt();
    // String a = "c1", b = "c2";
    // System.out.printf(builders(a, b, N));
    // iScanner.close();
    // }
    
    // }

//     Напишите метод void, который сжимает строку. Пример: вход aaaabbbcddaa.
// результат - a4b3cd2a2

// public class sem_2 {
//     public static void name(String N) {
//     StringBuilder sb = new StringBuilder();
//     int count = 1;
//     char temp = N.charAt(0);
//     sb.append(temp);
//     for (int i = 1; i < N.length(); i++) {
//         if (temp != N.charAt(i)) {
//             if (count != 1) {
//                 sb.append(count);
//                 count = 1;
//             }
//         sb.append(N.charAt(i));
//         temp = N.charAt(i);
//         }   
//         else {
//             count += 1;
//         }
//     }
//     if (count != 1) {
//         sb.append(count);
//     }
//     System.out.print(sb.toString());
//     }
    
//     public static void main(String[] args) {
//     System.out.print("Введите число N: ");
//     Scanner iScanner = new Scanner(System.in);
//     String N = iScanner.nextLine();
//     name(N);
//     iScanner.close();
//     }
// }

// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает
// boolean значение).

// public class sem_2 {
//     public static boolean name(String N) {
//     for (int i = 0; i < N.length() / 2; i++) {
//     if (N.charAt(i) != N.charAt((N.length() - i - 1)))
//     return false;
//     }
//     return true;
//     }
//     public static void main() {
//     Scanner iScanner = new Scanner(System.in);
//     System.out.println("Введите число: ");
//     String N = iScanner.nextLine();
//     System.out.println(name(N));
//     iScanner.close();
//     }
//     }

// записать в текстовый файл слово TEST 10 раз

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class sem_2 {
public static void main(String[] args) {
    File file = new File("aaa.txt");
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i <= 10; i++){
        sb.append("тест");
    }
    try{
        FileWriter fr = new FileWriter(file);
        fr.write(sb.toString());
        fr.close();
    }
    catch(IOException e) {
        System.out.println("ERROR ");
    }
}
}