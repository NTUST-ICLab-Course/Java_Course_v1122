import java.awt.Color;
import java.awt.Graphics;

public class Spot {

    private double X, Y, R;
    private Color myColor;

    public Spot() {
        X = 200;
        Y = 200;
        R = 25;
        myColor = Color.RED;
    }

    public Spot(double x, double y, double r, Color c) {
        X = x;
        Y = y;
        R = r;
        myColor = c;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    public boolean intersect(Spot spot) {
        double d = distance(X, Y, spot.getX(), spot.getY());
        return (d <= (R + spot.getR()));
    }

    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public void drawme(Graphics myBuffer) {
        myBuffer.setColor(myColor);
        myBuffer.fillOval((int) (getX() - getR()), (int) (getY() - getR()), (int) (getR() * 2), (int) (getR() * 2));
    }
}
