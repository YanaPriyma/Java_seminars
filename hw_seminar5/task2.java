package hw_seminar5;

import java.util.*;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class task2 
{
    public static Map<String, Integer> countRepeat(Map<Integer, ArrayList<String>> map) {
        Map<String, Integer> employees = new HashMap<>();
        int count = 0;
        for (var elementI : map.entrySet()) {
            if (!employees.containsKey(elementI.getValue().get(0))) {
                String name = elementI.getValue().get(0);
                for (var elementJ : map.entrySet()) {
                    if (elementJ.getValue().get(0).equals(name))
                        count += 1;
                }
                employees.put(name, count);
                count = 0;
            }
        }
        return employees;
    }

    public static void sortList(Map<String, Integer> map) {
        for (int i = map.size()-1; i>0; i--) {
            for (var element : map.entrySet()) {
                if (element.getValue() == i) {
                    System.out.printf(element.getKey() + " " + element.getValue()+", ");
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arEmployees = new String[] { "Иван Иванов", "Светлана Петрова", 
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов" };
        Map<Integer, ArrayList<String>> contacts = new HashMap<>();
        for (int i = 0; i < arEmployees.length; i++) 
        {
            String[] arrNew = arEmployees[i].split(" ");
            ArrayList<String> emloyee = new ArrayList<>();
            for (int j = 0; j < arrNew.length; j++) 
            {
                emloyee.add(arrNew[j]);
            }
            contacts.put(i + 1, emloyee);
        }
        Map<String, Integer> finalEmployees = countRepeat(contacts);
        sortList(finalEmployees);
    }
}
