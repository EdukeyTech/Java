public class Shape { // ата-ана классы
    public double calculateArea() {
        return 0.0;
    }
}

public class Circle extends Shape { // Дөңгелек пішіні. Shape атты класстан мұрагерлікпен ақпараттарды қабылдап отыр
    private double radius;

    public Circle(double radius) { // Конструктор 
        this.radius = radius;
    }

    @Override // Басып жазу, ата-ана классындағы әдісті(методты) жаңадан жазу
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {// Тік төртбұрыш пішіні. Shape атты класстан мұрагерлікпен ақпараттарды қабылдап отыр

    private double width;
    private double height;

    public Rectangle(double width, double height) { // Конструктор 
        this.width = width;
        this.height = height;
    }

    @Override // Басып жазу, ата-ана классындағы әдісті(методты) жаңадан жазу
    public double calculateArea() {
        return width * height;
    }
}
