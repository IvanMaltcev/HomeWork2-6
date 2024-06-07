import java.util.*;

public class Main {
    private static final List<Integer> numbers = new ArrayList<>(
            List.of(1, 1, 3, 4, 4, 5, 5, 6, 7, 2));
    private static final List<String> words = new ArrayList<>(
            List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (int number : numbers) {
            if (!(number % 2 == 0)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        Collections.sort(numbers);

        int checkNumber = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number % 2 == 0 && number != checkNumber) {
                System.out.print(number + " ");
                checkNumber = number;
            }
        }
        System.out.println();
    }

    public static void task3() {
        Set<String> selectedWords = new HashSet<>(words);
        System.out.println(selectedWords);
    }
    public static void task4() {
        Map<String, Integer> amountEachWord = new HashMap<>();
        for (String word : words) {
            if (!amountEachWord.containsKey(word)) {
                amountEachWord.put(word, 1);
            } else {
                amountEachWord.merge(word, 1, Integer::sum);
            }
        }
        System.out.println(amountEachWord.values());
    }
}