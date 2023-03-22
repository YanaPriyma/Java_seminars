
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

// import java.util.HashMap;
// import java.util.Map;

// // Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// // 123456 Иванов
// // 321456 Васильев
// // 234561 Петрова
// // 234432 Иванов
// // 654321 Петрова
// // 345678 Иванов
// // Вывести данные по сотрудникам с фамилией Иванов.
// public class Task_01 {
// public static void main(String[] args) {
// Map<Integer, String> data = new HashMap<>();
// data.put(123456, "Иванов");
// data.put(321456, "Васильев");
// data.put(234561, "Петрова");
// data.put(234432, "Иванов");
// data.put(654321, "Петрова");
// data.put(345678, "Иванов");
// for (var element : data.entrySet()) {
// System.out.printf("key: %s; value: %s \n", element.getKey(), element.getValue());
// }

// for (var element : data.entrySet()) {
// if (element.getValue().equals("Иванов")) {
// System.out.println(element.getKey());
// }
// }
// }
// }


// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "bar"

// Output: false

// Пример 2:

// Input: s = "paper", t = "title"

// Output: true
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class task_2 {
// static boolean isIsomorpf(String strFirst, String strSecond) {
// if (strFirst.length() != strSecond.length()) {
// return false;
// }
// Map<Character, Character> data = new HashMap<>();
// for (int i = 0; i < strFirst.length(); i++) {
// if (!data.containsKey(strFirst.charAt(i))) {
// data.put(strFirst.charAt(i), strSecond.charAt(i));
// } else {
// if (data.get(strFirst.charAt(i)) != strSecond.charAt(i)) {
// return false;
// }
// }

// }
// return true;
// }

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// System.out.println("Enter first word!: ");
// String strFist = scn.nextLine();
// System.out.println("Enter second word!: ");
// String strSecond = scn.nextLine();
// if (isIsomorpf(strFist, strSecond)) {

    //Написать программу, определяющую правильность расстановки скобок в выражении.

// Пример 1: a+(d*3) - истина

// Пример 2: [a+(1*3) - ложь

// Пример 3: [6+(3*3)] - истина

// HashMap<String, Integer> openBrackets = new HashMap<String, Integer>() {{
// put("{", 0);
// put("[", 1);
// put("(", 2);
// }};



// static boolean ex2(String s){
// char[] chars = s.toCharArray();
// Stack<Character> stack = new Stack<>();
// Map<Character, Character> map = new HashMap<>();
// String[] c1 = new String[]{"()", "{}", "[]", "<>"};
// for (int i = 0; i < c1.length; i++) {
// String a = c1[i];
// map.put(a.charAt(1), a.charAt(0));
// }
// for (int i = 0; i < chars.length; i++) {
// if (map.containsValue(chars[i])){
// stack.push(chars[i]);
// }
// if (map.containsKey(chars[i])){
// if (stack.empty() || map.get(chars[i]) != stack.pop()){
// return false;
// }
// }
// }
// return stack.empty();
// }
