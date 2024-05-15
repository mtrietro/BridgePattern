package Main;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando Circle[ color: verde, radius: " + radius + ", x: " + x + " , y: " + y + " ]");
    }
}
