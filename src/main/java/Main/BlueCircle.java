package Main;

public class BlueCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando Circle[ color: azul, radius: " + radius + ", x: " + x + " , y: " + y + " ]");
    }
}
