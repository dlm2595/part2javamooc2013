package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.fillRect(75, 50, 50, 50);
        graphics.fillRect(250, 50, 50, 50);
        
        graphics.fillRect(25, 200, 50, 50);
        graphics.fillRect(75, 250, 225, 50);
        graphics.fillRect(300, 200, 50, 50);

    }
}
