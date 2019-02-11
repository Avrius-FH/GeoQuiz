package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends JFrame {
   private static final int ROWS = 3 ;
   private static final int COLS = 4 ;
   private JButton[] buttons = new JButton[ROWS * COLS] ;
   private JPanel[] panels = new JPanel[ROWS *COLS ] ;

   public static void main(String[] args) {
      new Grid() ;
   }

   public Grid (){
      Container contentPane = getContentPane() ;
      contentPane.setLayout(new GridLayout(ROWS, COLS));
      //this.setBounds(50, 50, 300 , 300);
      this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      for ( int i = 0 ;  i < ROWS * COLS ; i ++ ) {
         buttons[i] = new JButton ( "Button " + (i+1))  ;


         buttons[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ((JButton)e.getSource()).setText("Clicked");
            }
         });
         //contentPane.add(buttons[i]) ;
         panels[i] = new JPanel();
         panels[i].add(buttons[i]) ;
         contentPane.add(panels[i]) ;
      }
      SwingUtilities.invokeLater(new Runnable() {
         //Anonymous class ( only created once and used once )
         // un-named class implements Runnable interface
         @Override
         public void run() {
            setVisible(true);
         }
      }) ;

   }
}
