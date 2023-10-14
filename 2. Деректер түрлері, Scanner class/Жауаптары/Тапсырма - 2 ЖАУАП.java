import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner объектісін жарияладаық
        System.out.print("Введите ваше имя: ");//Жай ғана өзіміз үшін текст шығарттық
        String name = scanner.nextLine();//Сканнер объектісі арқылы name деп аталатын айнымалыға мән бердік.
        System.out.println("Привет, " + name + "!");//Текстке айнымалы мәнін қосып шығарып бердік.
    }
}
