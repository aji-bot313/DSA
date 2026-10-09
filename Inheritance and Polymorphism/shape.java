public class shape {
    public String color;

    public shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    void printShape() {
        System.out.println("This is a shape with color: " + color);
    }
}