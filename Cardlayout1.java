

import java.awt.event.*;
import javax.swing.*;

public class Cardlayout1 extends JFrame implements ActionListener
{
    CardLayout card;
    JButton b1,b2,b3;
    Container c;
     Cardlayout1()
     {
    c=getContentPane();
    card=new CardLayout(40,30);
    c.setLayout(card);
    b1=new JButton("Hello");
    b2=new JButton("Good");
    b3=new JButton("Morning");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
         c.add(b1); c.add(b2);c.add(b3);
     }
     public void actionPerformed(ActionEvent e){
         card.next(c);
     }
     public static void main(String[] args)
     {
         Cardlayout1 cl=new Cardlayout1();
         cl.setSize(400,400);
         cl.setVisible(true);
         cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
          
    }
}
