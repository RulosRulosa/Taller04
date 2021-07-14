package ManejoArchivos;

import Clases_GUIs.Ventana_menu;
public class GestorVentanas {

    private Ventana_menu launcher;


    public  void ejecutarVentanaMenu(){
        this.launcher = new Ventana_menu();
        this.launcher.setBounds(0, 0, 400, 550);
        this.launcher.setVisible(true);
        this.launcher.setLocationRelativeTo(null);
        this.launcher.setResizable(false);
    }
}
