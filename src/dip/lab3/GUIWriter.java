package dip.lab3;

import javax.swing.JOptionPane;
/**
 *
 * @author pdavis13
 */
public class GUIWriter implements Writer{
    public final void writeMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
