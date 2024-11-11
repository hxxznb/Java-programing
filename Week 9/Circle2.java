public class Circle2 {

    double radius;

    static int numberOfObjects = 0;

    public Circle2() {
        radius = 1;
        numberOfObjects++;
    }
    public Circle2(int r) {
        radius = r; 
        numberOfObjects++;
    }


    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
