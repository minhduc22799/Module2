package MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        MoveAblePoint  moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);
        moveAblePoint.move();
    }
}
