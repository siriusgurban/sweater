package classes;

public class MyLine {

    public MyPoint point1;
    public Point point;

    public MyLine(int x, int y, int pointStart, int pointEnd) {
        this.point1 = new MyPoint(x, y);
        this.point = new Point(pointStart, pointEnd);

    }

    class MyPoint {
        public int x;
        public int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println();
        }
     }

    class Point{
        public int pointStart;
        public int pointEnd;

        public Point(int pointStart, int pointEnd) {
            this.pointStart = pointStart;
            this.pointEnd = pointEnd;
            System.out.println();
        }
    }


}
