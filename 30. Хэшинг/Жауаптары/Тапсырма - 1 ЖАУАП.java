import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {
    public static void main(String[] args) {
        // Set құрастыру
        Set<String> set = new HashSet<>();

        // Стрингдерді саламыз
        set.add("Hello");
        set.add("World");
        set.add("Java");

        // Хешкодты шығарып беру
        for (String item : set) {
            int hashCode = item.hashCode(); // .hashCode() әдісі(методы) элементтің хэшын есептеп береді.
            System.out.println(item + " - Хешкод: " + hashCode);
        }
    }
}
