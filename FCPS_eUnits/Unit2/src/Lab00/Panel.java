package Lab01;
import javax.swing.*;

public class Panel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // 確保畫面正確刷新
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 400, 400); // 填滿背景

        g.setColor(Color.GREEN.darker());
        g.fillRect(0, 350, 400, 350);

        g.setColor(Color.RED);
        g.fillRect(100, 200, 150, 150);

        g.setColor(Color.BLACK);
        g.fillRect(150, 275, 50, 75);

        // 繪製三角形（需要三個點）
        int[] xPoints = {75, 125, 175};
        int[] yPoints = {200, 150, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.YELLOW);
        g.fillOval(300, 75, 50, 50);

        g.setColor(Color.WHITE);
        g.drawString("Welcome Home", 40, 40);
    }
}
