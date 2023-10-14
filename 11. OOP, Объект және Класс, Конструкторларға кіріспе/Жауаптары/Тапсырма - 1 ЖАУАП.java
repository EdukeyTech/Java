public class Person { // Класс жариялану жолы
    private String name;
    private int age;

    public Person(String name, int age) { // Конструктор
        this.name = name;
        this.age = age;
    }

    public void displayInfo() { // Толық ақпарат беретін әдіс
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Беимбет", 30);
        person.displayInfo();
    }
}
