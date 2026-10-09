class circle extends shape {
    protected double radius;

    public circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area() {
        return  22.0 / 7.0 * (radius * radius);
    }
    @Override
    public void printShape() {
        System.out.println("The " + color + " Circle, area = " + area());
    }
}