public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n); // рекурсивті әдісті(методты) шақыру
        System.out.println("Факториал " + n + " = " + result);
    }
    
    public static int factorial(int n) { // рекурсивті метод
        if (n == 0 || n == 1) { // base case
            return 1;
        } else {
            return n * factorial(n - 1); // рекурсия тудыратын бөлік
        }
    }
}
