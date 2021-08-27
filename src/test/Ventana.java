package test;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JButton boton = new JButton("Click");
        boton.setLocation(30, 30);        
        ventana.setSize(300, 200);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Mi Ventana");
        ventana.setVisible(true);
        ventana.add(boton);
    }
    
}
