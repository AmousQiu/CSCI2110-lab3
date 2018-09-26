public class PointTester {
    public static void main(String[] args) {
        Point<Integer> point1 = new Point<Integer>(56, 234);
        Point<Double> point2 = new Point<Double>(53.4, 65.4);
        Point<String> point3 = new Point<String>("tafg", "ahjar");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }
}
