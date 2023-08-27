import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawShapes extends JPanel {
    private int choice;

    public DrawShapes(int UserChoice) {
        choice = UserChoice;
        setBackground(new Color(50, 50, 50));
    }

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        int height = getHeight();
        int width = getWidth();

        for (int i = 0; i < 16; i++) 
        {
            switch (choice)
            {
                case 1:
                    g.setColor(Color.BLUE);
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.RED);
                    g.drawRect(10 + i * 10, height -60 - i * 20, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.GREEN);
                    g.drawRect(width - 60 -  i * 20, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.YELLOW);
                    g.drawRect(width - 60 -  i * 20, height -60 - i * 20, 50 + i * 10, 50 + i * 10);
                    break;

                case 2:
                    g.setColor(Color.BLUE);
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.RED);
                    g.drawOval(10 + i * 10, height -60 - i * 20, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.GREEN);
                    g.drawOval(width - 60 -  i * 20, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.YELLOW);
                    g.drawOval(width - 60 -  i * 20, height -60 - i * 20, 50 + i * 10, 50 + i * 10);
                    break;
                
                case 3:
                    g.setColor(Color.BLUE);
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.RED);
                    g.drawRect(10 + i * 10, height -60 - i * 20, 50 + i * 10, 50 + i * 10);
                    g.setColor(Color.GREEN);
                    g.drawRoundRect(width - 60 -  i * 20, 10 + i * 10, 50 + i * 10, 50 + i * 10, i*12, i*5);
                    g.setColor(Color.YELLOW);
                    g.drawRoundRect(width - 60 -  i * 20, height -60 - i * 20, 50 + i * 10, 50 + i * 10, i*12, i*10);
                    break;

                default:
                    setBackground(Color.WHITE);

                    g.setColor(Color.YELLOW);
                    g.fillOval(130, 100, 500, 500);
            
                    g.setColor(Color.BLACK);
                    g.fillOval(240, 420, 275, 170);
            
                    g.setColor(Color.YELLOW);
                    g.fillOval(240, 430, 275, 170);
            
                    g.setColor(Color.BLACK);
                    g.fillOval(240, 225, 75, 75);
                    g.fillOval(440, 225, 75, 75);
                    g.setFont(new Font("MV BOLI",Font.BOLD,50));
                    g.drawString("Input Error!", 220, 670);
                    break;
            }
        }
    }


    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog(
            "Enter: \n1 to draw rectangles, \n2 to draw ovals, \n3 to draw a mixture.");

        int choice = Integer.parseInt(input);

        DrawShapes panel = new DrawShapes(choice);

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
