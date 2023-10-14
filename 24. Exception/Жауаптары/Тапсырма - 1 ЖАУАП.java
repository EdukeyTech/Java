public class ExceptionHandling {
    public static void main(String[] args) {
        try { // код қатесін тінтіп отыратын бөлік
            int result = divideByZero();
            System.out.println("Бөлу нәтижесі: " + result);
        } catch (ArithmeticException e) { // Қатені ұстап беретін бөлік
            System.out.println("Қате: нөлге болуге болмайды");
        }
    }

    public static int divideByZero() {  // санды бөлу әдісі(метод)
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }
}
