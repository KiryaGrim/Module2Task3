import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        // Заполняем массив случайными числами от 1 до 15 включительно
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15) + 1;
        }

        // Выводим массив
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // Подсчитываем количество вхождений в массив для каждого числа
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Выводим числа, которые встречаются более одного раза
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число '" + entry.getKey() + "' встречается " + entry.getValue() + " раза");
            }
        }
    }
}
