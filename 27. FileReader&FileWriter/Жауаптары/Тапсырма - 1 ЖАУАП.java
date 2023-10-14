import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Файл міндетті түрде осы java файлымен біп папкада жатуы қажет

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {  // try бөлімінде кез келген объектіні жазуға болады
            String line;//бір String айнымалысын уақытша ашты
            while ((line = reader.readLine()) != null) { // Әр жаңа жол оқып оның null мәніне тең болғанша оқиды
                System.out.println(line);
            }
        } catch (IOException e) {// Файл оқыған кезде қате туындаса
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
} 
