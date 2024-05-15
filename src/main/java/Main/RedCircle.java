package Main;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando Circle[ color: vermelho, radius: " + radius + ", x: " + x + " , y: " + y + " ]");
    }
}
