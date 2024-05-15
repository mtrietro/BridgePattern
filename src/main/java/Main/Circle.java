package Main;

public class Circle extends Shape {

    private int radius, x, y;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;

    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
