import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {//Егерде сан 2-ге бөлгенде қалдығы 0-ге тең болса, сан жұп деген сөз.
            System.out.println("Число четное.");
        } else {//Егерде сан 2ге бөлгенде қалдығы 0-ге тең болмаса, сан тақ деген сөз
            System.out.println("Число нечетное.");
        }
    }
}
