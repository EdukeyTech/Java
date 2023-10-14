import java.util.PriorityQueue;
import java.util.Queue;

public class TaskQueue {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>(); // Приоритет бойынша сұрыптап сақтайды.
        priorityQueue.add("Тапсырма 3 (Төмен приоритет)");
        priorityQueue.add("Тапсырма 1 (Жоғары приоритет)");
        priorityQueue.add("Тапсырма 2 (Орташа приоритет)");
        
        while (!priorityQueue.isEmpty()) { // Кезек толықтай тауысылғанға дейін цикл орындалып отырады
            System.out.println("Орындалды: " + priorityQueue.poll()); // Элементті кезегі бойынша өшіре отыра шығарып беріп отырады.
        }
    }
}
