class Circle extends Figure {
    final double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * (radius * radius);
    }
}