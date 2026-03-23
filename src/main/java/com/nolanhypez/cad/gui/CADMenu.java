package com.nolanhypez.cad.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CADMenu {
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;

    public CADMenu() {
        frame = new JFrame("CAD Menu");
        panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        button1 = new JButton("Button 1");
        button1.setBounds(50, 100, 100, 25);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked!");
            }
        });
        panel.add(button1);

        button2 = new JButton("Button 2");
        button2.setBounds(200, 100, 100, 25);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked!");
            }
        });
        panel.add(button2);
    }

    public static void main(String[] args) {
        new CADMenu();
    }
}