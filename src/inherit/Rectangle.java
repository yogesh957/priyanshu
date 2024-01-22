package inherit;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Square extends Rectangle {
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Length: " + square.length + ", Width: " + square.width); // Output: Length: 5, Width: 5
        }
}