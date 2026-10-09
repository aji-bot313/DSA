class cylinder extends circle {
    private double height;

    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getheight(){
        return height;
    }
    public void setheight (double height){
        this.height = height;
    }
    public double CalculateVolume() {
        return 22.0 / 7.0 * (radius * radius) * height;
    }
    @Override
    public void printShape() {
        System.out.println("The " + color + " Cylinder, volume = " + CalculateVolume());
    }
}