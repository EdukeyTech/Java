public class AddNumbers {
    public static void main(String[] args) {
        int result = add(5, 7); // Элементті белгілі бір әдістегі логика арқылы өңдеіден өткізіп, қайтару
        System.out.println("Сумма: " + result);
    }
    
    public static int add(int a, int b) { // параметрлі және қайтару түрі int әдісі.
        return a + b;  // return элементті, шақырған жеріне қайтарып береді 
    }
}
