public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(); // StringBuilder жариялану жолы
        stringBuilder.append("Сәлем, "); // .append(String) әдісі арқылы текст қосу
        stringBuilder.append("әлем!"); // .append(String) әдісі арқылы текст қосу
        
        String result = stringBuilder.toString(); // .toString() әдісі арқылы String-ке айналдыру
        System.out.println(result);
    }
}
