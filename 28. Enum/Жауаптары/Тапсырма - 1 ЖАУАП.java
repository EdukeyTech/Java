public enum DayOfWeek { // enum жасалды
    Дүйсенбі,
    Сейсенбі,
    Сәрсенбі,
    Бейсенбі,
    Жұма,
    Сенбі,
    Жексенбі
}

public class WorkingDay {
    public static String getDayStatus(DayOfWeek day) {
        switch (day) {  // switch қолдану арқасында қандай екенін анықтау
            case Дүйсенбі:
                return day + " - Жұмыс күні"; // Бұл жерге break; керек еместігі return болуына байланысты. return кезінде автоматты түрде метод тоқталады
            case Сейсенбі:
                return day + " - Жұмыс күні"; 
            case Сәрсенбі:
                return day + " - Жұмыс күні"; 
            case Бейсенбі:
                return day + " - Жұмыс күні"; 
            case Жұма:
                return day + " - Жұмыс күні"; 
            case Сенбі:
                return day + " - Демалыс күні"; 
            case Жексенбі:
                return day + " - Демалыс күні";
            default: // Егерде енгізілген(параметр арқылы келген) ақпарат еш-қай кезді қанағаттандырмаса, ондай күн жоқтығын шығарады.
                return "Аптада бұндай күн жоқ";
        }
    }

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.ПОНЕДЕЛЬНИК; //enum жариялануы
        String status = getDayStatus(day); // қандай күн екенін айтатын әдіс(метод)
        System.out.println(status);
    }
}
