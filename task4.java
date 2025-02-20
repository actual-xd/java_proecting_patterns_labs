public class task4 {
    public static class Circle {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String calculateSquare() {
            return String.format("%.2f", Math.PI * this.radius * this.radius);
        }


        public String calculatePerimeter() {
            return String.format("%.2f", Math.PI * this.radius * 2);
        }

        public void printSpecs() {
            System.out.println("Circle's perimeter is " + calculatePerimeter() + " and circle's square is " + calculateSquare());
        }
    }

    public static void main(String[] args) {
        Circle circle_1 = new Circle(4.3);
        circle_1.printSpecs();
    }


}






