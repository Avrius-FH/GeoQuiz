package package1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentPlay extends JFrame {

   //Component == Widgets

   private JLabel name = new JLabel("name");
   private JTextField nameField = new JTextField(20);  // number of characters-ish (some standard character width)
   private JCheckBox studentCheck = new JCheckBox("Student"); // arg is next to check box in gui
   private JRadioButton[] buttons = new JRadioButton[3] ;
   private JButton clearButton = new JButton("Clear") ;
   private JButton cancelButton = new JButton("Cancel");
   private JButton saveButton = new JButton("Save") ;        // there is a way to make
   private ButtonGroup buttonGroup = new ButtonGroup();

   public ComponentPlay(){
      super("Entry Form");

      Container contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());

      JPanel northPanel = getNorthPanel() ;

      this.add(getNorthPanel(), BorderLayout.NORTH);
      this.add(getCenterPanel(), BorderLayout.CENTER ) ;
      this.add(getSouthPanel(), BorderLayout.SOUTH) ;

      clearButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            nameField.setText("");
            studentCheck.setSelected(false);
            buttonGroup.clearSelection();

         }
      });

      saveButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // outside this
            JOptionPane.showMessageDialog(ComponentPlay.this, "Saved!");
         }
      });
      cancelButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

         }
      });
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);
      pack();

      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            setVisible(true);
         }
      });
   }

   private JPanel getCenterPanel(){


      JPanel centerPanel = new JPanel() ;
      Border border = BorderFactory.createTitledBorder("Gender") ;
      centerPanel.setBorder(border);
      centerPanel.setLayout(new GridLayout(buttons.length, 1));

      buttons[0] = new JRadioButton("Male");
      buttons[1] = new JRadioButton("Female") ;
      buttons[2] = new JRadioButton( "It's complicated");

      for ( JRadioButton button : buttons){
         centerPanel.add(button) ;
         buttonGroup.add(button);
      }

      return centerPanel ;

   }

   private JPanel getNorthPanel(){
      JPanel northPanel = new JPanel();
      JPanel tempPanel;

      northPanel.setLayout(new GridLayout(3, 1));
      tempPanel = new JPanel();
      tempPanel.add(name);
      northPanel.add(tempPanel);

      tempPanel = new JPanel();
      tempPanel.add(nameField);
      northPanel.add(tempPanel);

      tempPanel = new JPanel() ;
      tempPanel.add(studentCheck);
      northPanel.add(tempPanel);



      return northPanel;
   }

   private JPanel getSouthPanel(){
      JPanel southPanel = new JPanel(new GridLayout(1, 3) ) ;

      JPanel[] panel = new JPanel[3] ;

      for ( int i = 0 ; i < panel.length ; i ++) {
         panel[i] = new JPanel() ;
      }

      panel[0].add(clearButton);
      panel[1].add(cancelButton);
      panel[2].add(saveButton);

      for ( JPanel aPanel : panel){

         southPanel.add(aPanel);


      }

      return southPanel ;

   }

   public static void main(String[] args) {
      new ComponentPlay();
   }
}
