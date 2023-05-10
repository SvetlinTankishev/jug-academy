
public class Main {
    public static void main(String[] args) {
        Point start = new Point(1, 2);
        Point end = new Point(3, 4);
        Line line = new Line(start, end);
        System.out.println(line.toString());
    }
}
