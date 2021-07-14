package Clases_GUIs;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;
import ManejoArchivos.GestorVentanas;
import java.util.*;

public class Ventana_menu extends JFrame{

    private GestorVentanas gestorVentanas;
    private JLabel etiqueta1,etiqueta2;
    private JTextArea listadesaparecidos, detalledesastre;
    private JScrollPane scroll;



    public Ventana_menu() {
        this.setLayout((LayoutManager)null);
        //etiquetas
        this.etiqueta1 = new JLabel("Lista desaparecidos:");
        this.etiqueta1.setBounds(10, 10, 500, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Detalles desastre: ");
        this.etiqueta2.setBounds(10, 240, 500, 30);
        this.add(this.etiqueta2);
        //texto
        this.listadesaparecidos = new JTextArea("");
        this.listadesaparecidos.setEditable(false);
        this.detalledesastre = new JTextArea("");
        this.detalledesastre.setEditable(false);
        //scroll
        this.scroll= new JScrollPane(listadesaparecidos);
        this.scroll.setBounds(10, 40, 365,200);
        this.scroll.setFont(new java.awt.Font("Tahoma", 0,14));
        this.add(scroll);

        this.scroll= new JScrollPane(detalledesastre);
        this.scroll.setBounds(10,270,365,200);
        this.scroll.setFont(new java.awt.Font("Tahoma", 0,14));
        this.add(scroll);
    }


}