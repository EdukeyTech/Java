public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 5 элементі бар массив жариялануы
        int sum = 0; // соңғы жауабын сақтап есептейтін айнымалы
        
        for (int i = 0 ; i < numbers.length; i++) {
            sum += numbers[i]; // әр елемент үшін қосындысын есептейді
        }
        
        System.out.println("Массив қосындысы: " + sum);
    }
}
