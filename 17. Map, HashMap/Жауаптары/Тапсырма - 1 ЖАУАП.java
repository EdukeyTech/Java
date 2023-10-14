import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>(); // Хэшмап жариялануы
        studentGrades.put("Иван", 90); // кілт ретінде адам аты және мәні оның бағасы
        studentGrades.put("Мария", 85);
        studentGrades.put("Алексей", 78);
        
        String studentName = "Мария";
        if (studentGrades.containsKey(studentName)) {  // біз get(Value) жасар алдында оның Map-та бар екеніне көз жеткізуіміз керек.
            int grade = studentGrades.get(studentName);
            System.out.println(studentName + " - баға: " + grade);
        } else {// егерде бұл студент табылмаса
            System.out.println("Аты " + studentName + " студент табылмады");
        }
    }
}
