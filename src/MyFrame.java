import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox check;
    ImageIcon green;
    ImageIcon red;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        green = new ImageIcon("green.png");
        red = new ImageIcon("red.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        check = new JCheckBox();
        check.setText("I'm not a robot");
        check.setFocusable(false);
        check.setFont(new Font("Consolas", Font.PLAIN, 30));
        check.setIcon(red);
        check.setSelectedIcon(green);

        this.add(button);
        this.add(check);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            System.out.println(check.isSelected());
        }
    }
}
