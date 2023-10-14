import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ай номері (1-12): ");
        int monthNumber = scanner.nextInt();
        
        String monthName;
        switch (monthNumber) {
            case 1: // 1 енгізген жағдайда
                monthName = "Қаңтар";
                break;
            case 2: // 2 енгізген жағдайда
                monthName = "Ақпан";
                break;
            // Әрі қаратай өздеріңіз толтырып көріңіздер...
            default:
                monthName = "Қате номері!";
        }
        
        System.out.println("Ай: " + monthName);
    }
}