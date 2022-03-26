import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class FourthPanel extends JPanel implements MouseMotionListener {

    private int x, y;


    public FourthPanel(){
        setLayout(null);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        //super.paintComponent(g);
        g.setColor(Color.red);
        g.drawLine(x, y, x ,y);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        x = e.getX();

        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
