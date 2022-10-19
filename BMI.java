
/**
 * Write a description of class BMI here.
 *
 * @Lawrence Miguel Cruz
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BMI extends JFrame
{
   JFrame jf = new JFrame();
   
   JLabel h_label = new JLabel();
   JLabel w_label = new JLabel();
   JLabel bmi_label = new JLabel();
   JLabel ft_label = new JLabel();
   JLabel in_label = new JLabel();
   JLabel lbs_label = new JLabel();
   
   JTextField ft_text = new JTextField();
   JTextField in_text = new JTextField();
   JTextField lbs_text = new JTextField();
   JTextField bmi_text = new JTextField();
   
   JButton compute = new JButton();
   JButton clear_b = new JButton();
   JButton exit_b = new JButton();
   
   public BMI(){
       setTitle("BMI calculator");
       
       getContentPane().setLayout(new GridBagLayout()); 
       GridBagConstraints gc = new GridBagConstraints();
        
       h_label.setText("Height: ");
       gc.gridx = 0;
       gc.gridy = 0;
       getContentPane().add(h_label, gc);
        
       w_label.setText("Weight: ");
       gc.gridx = 0;
       gc.gridy = 1;
       getContentPane().add(w_label, gc);
       
       bmi_label.setText("BMI: ");
       gc.gridx = 0;
       gc.gridy = 2;
       getContentPane().add(bmi_label, gc);
       
       compute.setText("Compute BMI");
       gc.gridx = 0;
       gc.gridy = 3;
       getContentPane().add(compute, gc);
        
       compute.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
                   compute_pressed(e);};
       });
        
       ft_text.setText("");
       ft_text.setColumns(15);
       gc.gridx = 1;
       gc.gridy = 0;
       getContentPane().add(ft_text, gc);
       
       lbs_text.setText("");
       lbs_text.setColumns(15);
       gc.gridx = 1;
       gc.gridy = 1;
       getContentPane().add(lbs_text, gc);
        
       bmi_text.setText("");
       bmi_text.setColumns(30);
       gc.gridx = 1;
       gc.gridy = 2;
       getContentPane().add(bmi_text, gc);
        
       clear_b.setText("Clear");
       gc.gridx = 1;
       gc.gridy = 3;
       getContentPane().add(clear_b, gc);
        
       clear_b.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){clear_pressed(e);}});

       ft_label.setText("feet");
       gc.gridx = 2;
       gc.gridy = 0;
       getContentPane().add(ft_label, gc);
        
       lbs_label.setText("pounds");
       gc.gridx = 2;
       gc.gridy = 1;
       getContentPane().add(lbs_label, gc);
        
       in_text.setText("");
       in_text.setColumns(15);
       gc.gridx = 3;
       gc.gridy = 0;
       getContentPane().add(in_text, gc);
        
       in_label.setText("inches");
       gc.gridx = 4;
       gc.gridy = 0;
       getContentPane().add(in_label, gc);
        
       exit_b.setText("Exit");
       gc.gridx = 4;
       gc.gridy = 3;
       getContentPane().add(exit_b, gc);
       
       exit_b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){exit_pressed(e);}
        });
        
       pack();
    }
    
    public static void main (String[] Args){
        new BMI().show();
        
    }
    
    private void compute_pressed(ActionEvent e){
        double BMI = 0; 
        double ft = 0, in=0, lbs=0, height=0;
        String ft_str, in_str, lbs_str, BMI_str;
        ft_str = ft_text.getText();
        in_str = in_text.getText();
        lbs_str = lbs_text.getText();
        ft = Double.parseDouble(ft_str);
        in = Double.parseDouble(in_str);
        lbs = Double.parseDouble(lbs_str);
        height = (ft*12) + in;
        BMI = (lbs / (height*height))*703;
        BMI_str = Double.toString(BMI);
        bmi_text.setText(BMI_str);
        
        
    }
    
    private void clear_pressed(ActionEvent e){
        ft_text.setText("");
        in_text.setText("");
        lbs_text.setText("");
        bmi_text.setText("");
    }
    
    private void exit_pressed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "Exiting Program");
        System.exit(0);
    }
   
}
