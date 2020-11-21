package ru.mirea.gif;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Gif one =new Gif();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(one);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }
}

