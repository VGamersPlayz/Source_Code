import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Repeater extends JFrame implements ActionListener
{
  
  JLabel inLabel    = new JLabel( "Enter Your Name:  " ) ;
  TextField inText  = new TextField( 15 );
  
  JLabel outLabel   = new JLabel( "Here is Your Name :" ) ;
  TextField outText = new TextField( 15 );
  
  public Repeater()      // constructor
  {
    getContentPane().setLayout( new FlowLayout() );
    getContentPane().add( inLabel  ) ;
    getContentPane().add( inText   ) ;
    getContentPane().add( outLabel ) ;
    getContentPane().add( outText  ) ;
    
    inText.addActionListener( this );
  }
  
  // The application code.
  void copyText()
  {
    String name = inText.getText();
    outText.setText( name );
  }
  public void actionPerformed( ActionEvent evt)
  {
    copyText();
    repaint();
  }
  public static void main ( String[] args )
  {
    Repeater echo  = new Repeater() ;
    WindowQuitter wquit = new WindowQuitter();
    echo.addWindowListener( wquit );
    echo.setSize( 300, 100 );
    echo.setVisible( true );
  }
}

class  WindowQuitter  extends WindowAdapter
{
  public void windowClosing( WindowEvent e )
  {
    System.exit( 0 );
  }
}
