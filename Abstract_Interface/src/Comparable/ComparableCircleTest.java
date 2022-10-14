package Comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(4.4,"black",true);

        System.out.println("pre-sorted");
        for (ComparableCircle x:circles) {
            System.out.println(x);
        }
        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle x : circles) {
            System.out.println(x);
        }
    }
}
