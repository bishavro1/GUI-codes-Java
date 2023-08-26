import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel
{
    final static Color VIOLET = new Color(128, 0, 128);
    final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colors =
    {
        Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
        Color.GREEN,  Color.YELLOW, Color.ORANGE, Color.RED
    };

    public DrawRainbow()
    {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int radius = 30;

        int centerX = getWidth()/2;
        int centerY = getHeight();

        for (int counter = colors.length; counter > 0; counter--)
        {
            g.setColor(colors[counter - 1]);

            g.fillArc(centerX - counter * radius,
                    centerY - counter * radius,
                    counter * radius * 2, counter * radius * 2, 0, 180);
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        DrawRainbow rainbow = new DrawRainbow();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rainbow);
        frame.setSize(800, 450);
        frame.setVisible(true);
    }
}
