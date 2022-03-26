import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FirstPanel extends JPanel implements ActionListener{
    
    private JButton btn;
    private JCheckBox chBox;
    private JComboBox comBox;

    public FirstPanel(){
        //поле для ввода текста
        JTextField text = new JTextField(20);
        add(text);

        btn = new JButton("ОК");
        btn.addActionListener(this);
        add (btn);

        chBox = new JCheckBox();
        chBox.setText("Я не робот!");
        chBox.addActionListener(this);
        add (chBox);

        JRadioButton pizzaBtn = new JRadioButton("Пицца");
        JRadioButton iceCreamBtn = new JRadioButton("Мороженное");
        JRadioButton saladBtn = new JRadioButton("Салат");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaBtn);
        group.add(iceCreamBtn);
        group.add(saladBtn);

        add(pizzaBtn);
        add(iceCreamBtn);
        add(saladBtn);

        //Выпадающий список
        String[] animals = {"dog", "cat", "bird"};
        comBox = new JComboBox(animals);
        comBox.addActionListener(this);
        add(comBox);

   
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            System.out.println("Нажата кнопка");
        } else if (e.getSource() == chBox){
            System.out.println("Я робот? - " + chBox.isSelected());
        } else if (e.getSource() == comBox) {
            System.out.println("Выран вариант:" + comBox.getSelectedItem());
        }
        System.out.println("Произошло действие");
        
    }
}
