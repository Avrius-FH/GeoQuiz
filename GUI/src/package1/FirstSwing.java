package package1;

import javax.swing.*;
import java.awt.*;

public class FirstSwing extends JFrame {

  //private JFrame  jFrame = new JFrame ( "My third GUI (sorta)");        // container (frame)

   public static void main(String[] args) {
      new FirstSwing();
   }


   // Gui runs on a thread

   public FirstSwing(){

      this.setTitle("My GUI");
      JLabel    jLabel = new JLabel("Hello, world!") ;
      JButton jButton = new JButton("Click me!");

      Container contentPane = this.getContentPane() ;
      contentPane.setLayout(new FlowLayout());
      contentPane.add(jLabel) ;
      contentPane.add(jButton);
      contentPane.add(new JButton("Button2")) ;



      this.setBounds(50, 50, 300 , 200);
      this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      SwingUtilities.invokeLater(new Runnable() {
         //Anonymous class ( only created once and used once )
         // un-named class implements Runnable interface
         @Override
         public void run() {
            setVisible(true);
         }
      });


   }

//   private class MyInnerClass implements Runnable {
//      @Override
//      public void run() {
//         setVisible(true);
//
//      }
   }

