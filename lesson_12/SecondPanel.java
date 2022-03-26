import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SecondPanel extends JPanel implements KeyListener{
    private JLabel label;
    public SecondPanel(){
        setLayout(null);
        label = new JLabel();
        //label.setBackground(Color.red);
        ImageIcon img = new ImageIcon("Без названия (1).jpg");
        label.setIcon(img);
        label.setOpaque(true);
        label.setBounds(0,0, img.getIconWidth(), img.getIconHeight());
        
        add(label);
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
       // System.out.println("Kнопка нажата");
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
       // System.out.println("Кнопка зажата");
       switch(e.getKeyChar()){
           case 'w':
           label.setLocation(label.getX(), label.getY() -20);
           break;
           case 's':
           label.setLocation(label.getX(), label.getY() +20);
           break;
           case 'a':
           label.setLocation(label.getX() -20, label.getY() );
           break;
           case 'd':
           label.setLocation(label.getX() +20, label.getY() );
           break;
           
       }

    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Кнопка отпущенна \nСимвол: " + e.getKeyChar() + "\nКод:" + e.getKeyCode());
    }
}
