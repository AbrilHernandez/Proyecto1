import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.GridBagLayout;
import javax.swing.JPasswordField;

public class Ventana extends JFrame{
JPanel panel=new JPanel(new GridBagLayout());
GridBagConstraints c=new GridBagConstraints();
JTextField cam= new JTextField("           ");
JPasswordField password=new JPasswordField("Password");
JLabel user=new JLabel("Username");
JButton cancel=new JButton("Cancel");
JButton ok=new JButton("ok    ");
JLabel com=new JLabel("Comments");
JLabel pass=new JLabel("Password");
JTextArea area=new JTextArea("dadadad    ");
public void agregarComponentes(){
panel.setVisible(true);
c.gridx=0;
c.gridy=0;
c.gridwidth=1;
c.gridheight=1;
c.weightx=1;
c.weighty=1;
panel.add(user, c);
c.gridx=0;
c.gridy=1;
panel.add(pass, c);
c.gridx=0;
c.gridy=2;
panel.add(com, c);
c.gridx=1;
c.gridy=3;
panel.add(ok, c);
c.gridx=2;
c.gridy=3;
panel.add(cancel, c);
c.gridx=1;
c.gridy=1;
c.weightx=1;
c.fill=GridBagConstraints.HORIZONTAL;
c.insets=new Insets(5, 5, 5, 5);
panel.add(password, c);
c.gridx=1;
c.gridy=0;
c.weightx=1;
c.fill=GridBagConstraints.HORIZONTAL;
c.insets=new Insets(5,5, 5, 5);
panel.add(cam, c);
c.gridx=1;
c.gridy=2;
c.weightx=1;
c.fill=GridBagConstraints.BOTH;
c.insets=new Insets(5, 5, 5, 5);
panel.add(area, c);
}


public void crearVentana(){
JFrame frame=new JFrame("Account Information");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setSize(500, 300);
agregarComponentes();
frame.getContentPane().add(panel);
}

public static void main(String ar[]){
Ventana t=new Ventana();
t.crearVentana();
}
}//clase

