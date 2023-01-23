public class Rectangle {
    private int width;
    private int length;;

    public Rectangle (int width, int length) {
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Negative values are not allowed");
        }
            this.width = width;
            this.length = length;

    }
    public int calculateArea() {
        int area = width * length;
        System.out.println("Area = " + area);
        return area;
    }
    public int calculatePerimeter () {
        int perimeter = width * 2 + length * 2;
        System.out.println("Perimeter = " + perimeter);
        return perimeter;
    }
}
class DemoRectangle {
    public static void main(String[] args) {
        Rectangle example = new Rectangle(10, 100);
        example.calculateArea();
        example.calculatePerimeter();
    }
}
