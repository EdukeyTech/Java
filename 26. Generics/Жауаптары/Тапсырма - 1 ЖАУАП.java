public class Box<T> { // Generics арқылы объектілер қойылады.
    private T value; // Generics арқылы объектілер қойылады.

    public void setValue(T value) { // Generics арқылы объектілер қойылады.
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();// Box объектісі жарияланды және generics арқылы Integer объектісі қойылып шықты
        integerBox.setValue(42);
        int intValue = integerBox.getValue();
        System.out.println("Бүтін сан: " + intValue);

        Box<String> stringBox = new Box<>();// Box объектісі жарияланды және generics арқылы Stirng объектісі қойылып шықты
        stringBox.setValue("Сәлем, әлем!");
        String stringValue = stringBox.getValue();
        System.out.println("Жол: " + stringValue);
    }
}
