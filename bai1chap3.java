public class bai1chap3
{
    package shapes;

    // Lớp hình vuông
    public class Square {
        private double side; // Cạnh của hình vuông

        // Constructor
        public Square(double side) {
            this.side = side;
        }

        // Getter và Setter
        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        // Phương thức tính diện tích
        public double getArea() {
            return side * side;
        }

        // Phương thức tính chu vi
        public double getPerimeter() {
            return 4 * side;
        }
    }

}