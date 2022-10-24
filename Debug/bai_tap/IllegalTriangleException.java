package bai_tap;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return "Error: These are not 3 sides of the triangle!";
    }
}
