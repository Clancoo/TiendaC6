package tienda.controlador;

import tienda.modelo.Modelo;
import tienda.vista.VentanaTienda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorTienda {
    private Modelo modelo;
    private VentanaTienda vista;

    public ControladorTienda(Modelo modelo, VentanaTienda vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarDatos();
            }
        });
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null); 
        this.vista.setVisible(true);
    }

    private void cargarDatos() {
        try {
            vista.modeloTabla.setRowCount(0);
            
            ResultSet rs = modelo.consultarUsuarios();
            
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                
                vista.modeloTabla.addRow(new Object[]{id, nombre, apellido, telefono});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(vista, "Error SQL: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

