packagebutton;//required imports
importjavax.swing.*;
importjava.awt.*;
importjava.awt.event.*;

public classgreeting2 {
  /**
  * Declare objects
  */
  staticJLabellabel;
  staticJButtonbtnClick;
  staticJButtonbtnItalian;
  
  //method to create GUI
  private static voidguiApp() {
    //Create and set up the window.
    JFrame frame =newJFrame("Simple GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //create and st up components
    JPanel panel =newJPanel();
    label=newJLabel("Text me!");
    btnClick=newJButton("Send text!");
    btnClick.setActionCommand("english");
    btnItalian=newJButton("Diff text!");
    btnItalian.setActionCommand("italian");
    
    //create a new ButtonHandler instance
    ButtonHandler onClick =newButtonHandler();
    btnClick.addActionListener(onClick);
    btnItalian.addActionListener(onClick);
    
    panel.add(btnClick);
    panel.add(btnItalian);
    panel.add(label);
    
    frame.add(panel);
    frame.setSize(250,100);
    frame.setVisible(true);
  }
  //create custom event handler
  private static classButtonHandlerimplementsActionListener {
    public voidactionPerformed(ActionEvent e){
      //which button?
      String command = e.getActionCommand();
      //give message
      if(command.equals("english")){
        label.setText("Hello world!");
      }else{
        label.setText("Ciao!");
      }
    }
  }
  //main method to run the GUI
  public static voidmain(String[] args) {
    javax.swing.SwingUtilities.invokeLater(newRunnable() {
      public voidrun() {
        guiApp();
      }
    });
  }
}
