import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoButtons extends JFrame implements ActionListener
{
  JButton redButton ;
  JButton grnButton ;
  
  // constructor for TwoButtons
  public TwoButtons()
  {
    redButton = new JButton("Red");
    grnButton = new JButton("Green");
    redButton.setActionCommand( "red" );   // set the  command
    grnButton.setActionCommand( "green" ); // set the  command
    
    getContentPane().setLayout( new FlowLayout() );
    getContentPane().add( redButton );
    getContentPane().add( grnButton );
    
    // register the buttonDemo frame
    // as the listener for both Buttons.
    redButton.addActionListener( this );
    grnButton.addActionListener( this );
  }
  public void actionPerformed( ActionEvent evt)
  {
    // check which command has been sent
    if ( evt.getActionCommand().equals("red") )
      getContentPane().setBackground(Color.red);
    else
      getContentPane().setBackground( Color.green );
    repaint();
  }
  
  public static void main ( String[] args )
  {
    TwoButtons demo  = new TwoButtons() ;

    WindowQuitter wquit = new WindowQuitter();
    demo.addWindowListener( wquit );
    
    demo.setSize( 200, 150 );
    demo.setVisible( true );
  }
}
class WindowQuitter extends WindowAdapter
{
  public void windowClosing( WindowEvent e )
  {
    System.exit( 0 );
  }
}
