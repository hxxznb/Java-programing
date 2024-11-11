public class Exercise1 {

    private double width;
    private double height;

    public Exercise1() {
        this.width = 1;  
        this.height = 1; 
    }


    public Exercise1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height; 
    }

    public double getPerimeter() {
        return 2 * (width + height); 
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Exercise1 rect1 = new Exercise1(4, 40);
        Exercise1 rect2 = new Exercise1(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
