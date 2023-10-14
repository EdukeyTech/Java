public interface Shape { // interface
    double calculateArea();
}

public class Circle implements Shape { // Circle классы 
    private double radius;

    public Circle(double radius) {// constructor
        this.radius = radius;
    }

    @Override// интерфейстегі жарияланған әдісті қайта анықтау
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle implements Shape { // rectangle классы
    private double width;
    private double height;

    public Rectangle(double width, double height) {  // constructor
        this.width = width;
        this.height = height;
    }

    @Override // интерфейстегі жарияланған әдісті қайта анықтау
    public double calculateArea() {
        return width * height;
    }
}
