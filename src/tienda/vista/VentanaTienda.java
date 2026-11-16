package tienda.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaTienda extends JFrame {
    public JButton btnCargar;
    public DefaultTableModel modeloTabla;
    public JTable tablaUsuarios;

    public VentanaTienda() {
        setTitle("Proyecto Tienda - Gestión de Usuarios");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Tabla con sus columnas
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Nombre", "Apellido", "Teléfono"}, 0);
        tablaUsuarios = new JTable(modeloTabla);
        
        add(new JScrollPane(tablaUsuarios), BorderLayout.CENTER);

        btnCargar = new JButton("Cargar Usuarios desde MySQL");
        add(btnCargar, BorderLayout.SOUTH);
    }
}

