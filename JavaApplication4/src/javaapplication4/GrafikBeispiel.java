/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author Peter
 */
import javax.swing.*;
 import javax.swing.event.*;
 import java.awt.event.*;
 import java.awt.*;
 import java.awt.Graphics.*;

 public class GrafikBeispiel  extends JFrame implements MouseListener {
 public  void main(String [] args) {
 GrafikBeispiel wnd = new GrafikBeispiel();
 } 

 public GrafikBeispiel() {
 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(700,700);

 // ACHTUNG: es folgt eine anonyme Klasse, die das Interface Icon implementiert
 Icon line = new Icon() { // Anfang anonyme Klasse
 public  void paintIcon(Component c, Graphics g, int x, int y) {
 // hier zeichnen
 g.setColor(Color.green);
 g.fillRect(10,10,getIconWidth(),getIconHeight());
 g.setColor(Color.red);
 g.drawLine(10,10,190,10);
 g.drawLine(190,10, 190, 190);
 g.drawLine(190,190, 10, 190);
 g.drawLine(10,190, 10, 10);
     }

 public int getIconWidth() { return 180; } // bestimmt die Breite des Icons
 public int getIconHeight() { return 180; } // bestimmt die Höhe des Icons
 }; // Ende anonyme Klasse


 //java.awt.Container content = getContentPane();
 //content.setLayout(new GridLayout(8,7));

 //Anzeigen der Linie
 JLabel a=new JLabel();
JLabel k=new JLabel(line);

 //a.add(k);
 JButton button=new JButton();
 JButton button2=new JButton();
a.setLayout(new GridLayout(40,40));
/*a.add(button);
a.add(button2);
JTextField text=new JTextField();
a.add(text);

JTextField text2=new JTextField();
a.add(text2);

JLabel text3=new JLabel();
a.add(text3);

JLabel text4=new JLabel();
a.add(text4);
  */

        JLabel [][]label=new JLabel[40][40];
for(int j=0;j<40;j++){
        for(int i=0;i<40;i++)
{
    label[i][j]=new JLabel();

    
        label[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
    
    label[i][j].setAlignmentX(10);
    label[i][j].setAlignmentY(10);

    label[i][j].getBaseline(10, 10);
    a.add(label[i][j]);

}
     }
        getContentPane().add(a);
/*text4.addMouseListener(this);

text4.setBorder(BorderFactory.createLineBorder(Color.black));
text3.setBorder(BorderFactory.createLineBorder(Color.black));
*/

 
 pack();
 show();
 }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Mouse action");
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }



}
