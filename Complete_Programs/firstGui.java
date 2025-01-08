package firstGuiPackage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class firstGuiPgm {
    /**
     * Declare objects
     */
    static JLabel label;
    static JTextField text1, text2;
    static JButton btnPlain;
    static JButton btnFancy;

    //method to create GUI
    private static void guiApp() {

        //Create and set up the window.
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create and set up components
        JPanel panel = new JPanel();
        label = new JLabel("Selection Text");
        btnPlain = new JButton("Send text!");
        btnPlain.setActionCommand("Plain");

        Icon bug2= new ImageIcon( "D:\\a-Teach\\Program Test Folder\\firstGUIProject\\images\\bug2.gif" );
        btnFancy = new JButton(bug2);
        //btnFancy = new JButton("Diff text!");
        btnFancy.setActionCommand("Fancy");

        

        //create a new ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler();
        btnPlain.addActionListener(onClick);
        btnFancy.addActionListener(onClick);

        text1 = new JTextField( "Programmers rock!", 20);
        text2 = new JTextField( "Uneditable text field", 15 );
        text2.setEditable( false );

        panel.add(btnPlain);
        panel.add(btnFancy);
        panel.add(label);
        panel.add(text1);
        panel.add(text2);

        frame.add(panel);
        frame.setSize(250,100);
        frame.setVisible(true);
    }

    //create custom event handler
    private static class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            //which button?
            String command = e.getActionCommand();
            //give message
            if(command.equals("Plain")){
                label.setText("You picked the plain button");
            } else {
                label.setText("You picked the Fancy Button!");
            }
        }
    }

    //main method to run the GUI
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                guiApp();
            }
        });
    }
}  
