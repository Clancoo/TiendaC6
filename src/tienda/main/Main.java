package tienda.main;

import tienda.modelo.Modelo;
import tienda.vista.VentanaTienda;
import tienda.controlador.ControladorTienda;

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        VentanaTienda vista = new VentanaTienda();
        
        ControladorTienda controlador = new ControladorTienda(modelo, vista);
        
        controlador.iniciar();
    }
}

