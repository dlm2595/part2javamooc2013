
import java.awt.Container;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Dimension;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private final Calc calc;
    
    public GraphicCalculator() {
        this.calc = new Calc();
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField fieldUp = new JTextField("0");
        fieldUp.setEnabled(false);
        
        JTextField fieldDown = new JTextField();  
        
        container.add(fieldUp);
        container.add(fieldDown);
        container.add(new Menu(calc, fieldUp, fieldDown));
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
