public class Example2 {

    public static void main(String[] args) {

        Circle Circle1 = new Circle();
        System.out.println("The area of the circle of radius " + Circle1.radius + " is " + Circle1.getArea());

        Circle Circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());

        Circle Circle3 = new Circle(75);
        System.out.println("The area of the circle of radius " + Circle3.radius + " is " + Circle3.getArea());

        Circle2.radius = 100;
        Circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());
    }

    double radius;

    Circle() {
        radius = 1;  
    }

    Circle(double newRadius) {
        radius = newRadius;  
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
