package vista;

import controlador.EmpleadoControlador;

import javax.swing.*;

public class VentanaEmpleados extends JFrame {

    private final EmpleadoControlador controlador;

    private final JTextField txtCedula = new JTextField();
    private final JTextField txtNombre = new JTextField();
    private final JTextField txtSalario = new JTextField();
    private final JTextField txtBonificacion = new JTextField();
    private final JComboBox<String> cmTipo = new JComboBox<>(EmpleadoControlador.TIPOS_EMPLEADO);


}
