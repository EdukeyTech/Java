public record Person(String name, int age) { // record жасалу жолы
}

public class RecordExample {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", 30); // Жазба объектісі
        Person person2 = new Person("Мария", 25); // Жазба объектісі

        System.out.println("Адам 1: " + person1.name() + ", " + person1.age() + " жас");
        System.out.println("Адам 2: " + person2.name() + ", " + person2.age() + " жас");
    }
}
