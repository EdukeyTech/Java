import java.util.HashSet;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>(); // Сет жариялануы
        uniqueNames.add("Мади");
        uniqueNames.add("Дияс");
        uniqueNames.add("Беимбет");
        uniqueNames.add("Дияс");
        
        System.out.println("Жалпылама аттар:");
        for (String name : uniqueNames) { // forEach циклы арқылы барлық элементтеріне жеке тоқталып, уақытша айнымалыға теңеп қолдану
            System.out.println(name);
        }
    }
}
