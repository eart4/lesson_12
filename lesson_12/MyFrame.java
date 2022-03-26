import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    public MyFrame(){
        setTitle("Моя програма");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        //add(new FirstPanel());
        
       // SecondPanel sPanel = new SecondPanel();
        //add(sPanel);
        //addKeyListener(sPanel);

        //add(new ThirdPanel());
        add(new FourthPanel());
        revalidate();

        
    }

}
