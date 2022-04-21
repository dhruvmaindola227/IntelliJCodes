package com.selfPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTPractise extends Frame  {
    AWTPractise(){
        setVisible(true);
        setSize(400,400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        TextField tf = new TextField();
        tf.setBounds(50,50,50,50);
        Button b1 = new Button("Click here");
        b1.setBounds(20,80,10,10);
        add(tf);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf.getText();
            }
        });
    }



    public static void main(String[] args) {
        AWTPractise awt= new AWTPractise();
    }
}
