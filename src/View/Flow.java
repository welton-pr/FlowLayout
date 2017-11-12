/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Laryssa
 */
public class Flow extends JFrame{
    public Flow(){
        init();
    }

    private void init() {
       
        this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
        
        JLabel l1 = new JLabel("teste1");
        this.add(l1);
        
        JLabel l2 = new JLabel("teste2");
        this.add(l2);
        
        JLabel l3 = new JLabel("teste3");
        this.add(l3);
        
        JLabel l4 = new JLabel("teste4");
        this.add(l4);
        
        JLabel l5 = new JLabel("teste5");
        this.add(l5);
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
