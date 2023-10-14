public class Person { // Person классы 
    private String name;
    private int age;

    public String getName() { // name айнымалысына геттер
        return name;
    }

    public void setName(String name) { // name айнымалысына сеттер
        this.name = name;
    }

    public int getAge() { // age айнымалысына геттер 
        return age;
    }

    public void setAge(int age) { // age айнымалысына сеттер
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Беимбет");
        person.setAge(17);

        System.out.println("Аты: " + person.getName());
        System.out.println("Жасы: " + person.getAge());
    }
}
