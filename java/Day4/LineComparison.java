package Day4;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Point point1 = new Point(2, 3);
        Point point2 = new Point(6, 7);

        Point point3 = new Point(1, 2);
        Point point4 = new Point(5, 6);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("Length of Line 1 : " + length1);
        System.out.println("Length of Line 2 : " + length2);

        if (line1.equals(line2)) {

            System.out.println("Both lines are equal");

        } else {

            System.out.println("Both lines are not equal");
        }

        int comparisonResult = line1.compareTo(line2);

        if (comparisonResult > 0) {

            System.out.println("Line 1 is greater than Line 2");

        } else if (comparisonResult < 0) {

            System.out.println("Line 1 is smaller than Line 2");

        } else {

            System.out.println("Both lines are equal");
        }
    }
}

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line implements Comparable<Line> {

    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {

        int xDifference = endPoint.x - startPoint.x;
        int yDifference = endPoint.y - startPoint.y;

        return Math.sqrt(
                Math.pow(xDifference, 2) +
                        Math.pow(yDifference, 2)
        );
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Line otherLine = (Line) obj;

        return Double.compare(
                this.calculateLength(),
                otherLine.calculateLength()
        ) == 0;
    }

    @Override
    public int compareTo(Line otherLine) {

        return Double.compare(
                this.calculateLength(),
                otherLine.calculateLength()
        );
    }
}

