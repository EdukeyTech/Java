import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Лист жариялану жолы
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        numbers.remove(2); // индексі 2 элементті өшіру
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
