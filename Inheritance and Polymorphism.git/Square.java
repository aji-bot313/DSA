class Square extends shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double area() {
        return side * side;
    }
    @Override
    public void printShape() {
        System.out.println("This is a square with color: " + getColor() + " and side length: " + side + " and area: " + area());
    }
}