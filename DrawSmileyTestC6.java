import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawSmileyTest
{
    public static class DrawSmiley extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            
            // Draw the face
            g.setColor(Color.YELLOW); 
            g.fillOval(10, 10, 200, 200);
            
            // Draw the eyes
            g.setColor(Color.BLACK); 
            g.fillOval(55, 65, 30, 30); 
            g.fillOval(135, 65, 30, 30);
            
            // Draw the mouth
            g.fillOval(50, 110, 120, 60);
            
            // "Touch up" the mouth into a smile
            g.setColor(Color.YELLOW); 
            g.fillRect(50, 110, 120, 30);
            g.fillOval(50, 120, 120, 40);
        }
    }

    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley(); 
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250); 
        application.setVisible(true);
    }
}
