public class task3 {
    public static class Rectangle {
        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double calculateSquare() {
            return width * height;
        }

        double calculatePerimeter() {
            return (width + height) * 2;
        }

        public void printSpecs() {
            System.out.println("The perimeter of this rectangle is " + calculatePerimeter() + " and the square is " + calculateSquare());
        }

    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(1.3, 3.4);
        rect1.printSpecs();
    }


}
