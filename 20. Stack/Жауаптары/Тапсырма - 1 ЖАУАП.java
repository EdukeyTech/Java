import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); // stack жариялануы
        stack.push("Элемент 1");// Элемент қосылуы
        stack.push("Элемент 2");
        stack.push("Элемент 3");
        
        System.out.println("Стектен шығарылу реті:");
        while (!stack.isEmpty()) {// Шартында стек бос болғанша цикл жүре береді және бір уақытта толықтай тазарып шығады.
            System.out.println(stack.pop());// Элементті өшіре тұра, реті бойынша элементті алып отыр
        }
    }
}
