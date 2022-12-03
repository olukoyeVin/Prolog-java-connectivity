/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import org.jpl7.PrologException;
import org.jpl7.Query;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
/**
 *
 * @author richy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1 = "consult('C:/Users/richy/Documents/swi/project.pl')";
    	Query q1 = new Query(s1);
    
    	System.out.println( s1 + ""+(q1.hasSolution() ? "success":"fail"  )+"");
    	
		String go1 = "go.";
		Query q2 = new Query(go1);
		
		System.out.println(	(q2.hasSolution() ) );
			
        
        
        
        
        
        
    /*       rontend front = new rontend();
           front.createFrame();
	


    }
}
class rontend {
    public rontend() {
    }

    void createFrame() {
        JFrame frame = new JFrame("prolog");
        Image icon = Toolkit.getDefaultToolkit().getImage("swipl.png");
        frame.setIconImage(icon);
        JButton run = new JButton("check");
        final JTextField txt = new JTextField();
        JTextField textField = new JTextField();
        final JLabel label1 = new JLabel();
        label1.setBounds(300, 130, 300, 30);
        txt.setBounds(300, 100, 300, 30);
        textField.setBounds(300, 150, 350, 30);
        run.setBounds(400, 200, 80, 40);
        frame.setSize(1000, 1000);
        frame.add(run);
        frame.add(txt);
        frame.add(textField);
        frame.add(label1);
        textField.setText("Enter your query here");
        run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String con = "consult('C:/Users/richy/Documents/swi/assignment1.pl')";
                    Query query = new Query(con);
                    System.out.println(query.hasSolution() ? "success" : "false");
                    String q =textField.getText();
                    Query query1= new Query(q);
                    //label1.setText(String.valueOf(query1.goal()));
                    txt.setText(query1.hasSolution()?"true":"false");
                    System.out.println(query1.hasSolution()?"true":"false");
                }
                catch (PrologException ex){
                    System.out.println("failed");
                }

            }
        });
        frame.setLayout((LayoutManager)null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
*/
    }
    }
    

