import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ThirdPanel extends JPanel implements MouseListener{
    private JLabel label;

    public ThirdPanel(){
        


        setLayout(null);
        label = new JLabel();
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setBounds(0,1, 70, 70);
        label.addMouseListener(this);
        add(label);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        label.setBackground(Color.yellow);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        label.setBackground(Color.orange);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        label.setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        label.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        label.setBackground(Color.blue);
    }
}
