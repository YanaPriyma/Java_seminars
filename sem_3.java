// public static void main(String[] args) {

// Scanner iScanner = new Scanner(System.in);
// System.out.print("Enter equation like '2? + ?5 = 69': ");
// String equation = iScanner.nextLine(); //2? + ?5 = 69.
// String message = "Решения нет!";
// for (int i = 0; i < 10; i++) {
//     String result = equation.replace("?", Integer.toString(i));
//     // 20 + 05 = 69
//     String[] arr = result.split(" ");
//     if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]))
//         message = result;
//     }
//     System.out.println(message);
// }



// public static void main(String[] args) throws IOException{
// Logger ll = Logger.getLogger(lg.class.getName());
// String logsPath = "log.txt";
// FileHandler fh = new FileHandler(logsPath, false);
// ll.addHandler(fh);
// SimpleFormatter formatter = new SimpleFormatter();
// // XMLFormatter form = new XMLFormatter();
// fh.setFormatter(formatter);

// for(int i = 0; i < 10; i++)
// {
// ll.log(Level.INFO,"element: " + i);
// }
// ll.log(Level.WARNING, "logger off" );

// ll.info("test" );
// ll.warning("logsPath");


// }


// public static void main(String[] args) throws IOException{
// Logger ll = Logger.getLogger(lg.class.getName());
// String logsPath = "log.txt";
// FileHandler fh = new FileHandler(logsPath, false);
// ll.addHandler(fh);
// SimpleFormatter formatter = new SimpleFormatter();
// // XMLFormatter form = new XMLFormatter();
// fh.setFormatter(formatter);

// ll.log(Level.INFO,"element: " + i);
// ll.log(Level.WARNING, "logger off" );

// ll.info("test" );
// ll.warning("logsPath");


// }

// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
// ArrayList<Integer>list = new ArrayList<>();
// Random rand = new Random();
// import java.util.Random;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Random;
// public class qqq
// {
//     public static void main(String[] args) throws IOException
// {
// ArrayList<Integer> ar = new ArrayList<Integer>();
// Random ran = new Random();
// for (int i = 0; i < 10; i++)
// {
// int x = ran.nextInt(10);
// ar.add(x);
// }
// System.out.println(ar.toString());
// ar.sort(Comparator.naturalOrder());
// System.out.println(ar.toString());
// }

// }

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.

// import java.util.ArrayList;
// import java.util.Arrays;

// import static java.util.Arrays.asList;

// public class Task2 {
// // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// // Вывести название каждой планеты и количество его повторений в списке.

// public static void main(String[] args) {

// ArrayList<String> list = new ArrayList<>(asList(
// "Земля",
// "Венера",
// "Земля",
// "Юпитер",
// "Марс",
// "Марс"));
// }
// }
// import java.util.ArrayList;
// import java.util.Arrays;

// // Заполнить список названиями планет
// // Солнечной системы в произвольном порядке с повторениями.
// // Вывести название каждой планеты
// // и количество его повторений в списке.

// public class planet {
// public static void main(String[] args) {
// ArrayList<String> ar = new ArrayList<>(
// Arrays.asList("Sun", "Mercury", "Venus", "Sun", "Mars", "Mercury", "Sun", "Earth", "Mars", "Jupiter",
// "Saturn", "Uranus", "Neptun", "Pluto"));
// int count = 0;
// ArrayList<String> result = new ArrayList<>();
// for (int i = 0; i < ar.size(); i++)
// {
// count = 0;
// if (!result.contains(ar.get(i))) {
// result.add(ar.get(i));
// for (int j = 0; j < ar.size(); j++) {

// if (ar.get(i).equals(ar.get(j))) {
// count += 1;

// }
// }
// System.out.println(count + ar.get(i));


// static void ex3(){
// ArrayList list = new ArrayList<>();
// list.add("asdad5");
// list.add("asdad4");
// list.add("asdad3");
// list.add(22);
// list.add(22);
// list.add(22);
// list.add("asdad2");
// list.add("asdad1");
// list.add(22);

// System.out.println(list);
// for (int i = list.size()-1; i >= 0; i--) {
// if (list.get(i) instanceof Integer){
// list.remove(i);

// }
// }
// System.out.println(list);
// }
