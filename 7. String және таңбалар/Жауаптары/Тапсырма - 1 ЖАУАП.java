import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String енгізіңіз: ");
        String input = scanner.nextLine();
        
        String reversed = ""; // соңында Жазу кері жазылуы сақталатын айнымалы
        for (int i = input.length() - 1; i >= 0; i--) { // (input.length() - 1) индексінен бастап, 0-ші индекске дейін жүруі қажет.
            reversed += input.charAt(i); // реттілік бойынша әр әріпті "reversed" айнымалысына қосып отырады
        }
        
        System.out.println("String кері шығғарып беріңіз: " + reversed);
    }
}
