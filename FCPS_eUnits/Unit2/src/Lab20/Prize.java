
import java.awt.Color;

class Prize extends Spot {

    // 屬性
    public Prize(double x, double y, double r, Color c) {
        super(x, y, r, c);
    }

    public void lightup() {
        setMyColor(Color.YELLOW);
    }
}
