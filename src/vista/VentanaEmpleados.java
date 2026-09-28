package vista;

import controlador.EmpleadoControlador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaEmpleados extends JFrame {

    private final EmpleadoControlador controlador;

    private final JTextField txtCedula = new JTextField();
    private final JTextField txtNombre = new JTextField();
    private final JTextField txtSalario = new JTextField();
    private final JTextField txtBonificacion = new JTextField();
    private final JComboBox<String> cmTipo = new JComboBox<>(EmpleadoControlador.TIPOS_EMPLEADO);

    private final JButton btnAgregar = new JButton("Agregar");
    private final JButton btnBuscar = new JButton("Buscar");
    private final JButton btnActualizar = new JButton("Actualizar");
    private final JButton btnEliminar = new JButton("Eliminar");
    private final JButton btnLimpiar = new JButton("Limpiar");
    private final JButton btnHistorial = new JButton("Historial");

    private DefaultTableModel datosTabla;
    private final JLabel lblResumen = new JLabel();

    public VentanaEmpleados(EmpleadoControlador controlador) {
        super("Sistema CRUD de Talento Humano");
        this.controlador = controlador;

        setLayout(new BorderLayout(10, 10));
        add(construirFormulario(), BorderLayout.NORTH);
        add(construirTabla(), BorderLayout.CENTER);
        lblResumen.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        add(lblResumen, BorderLayout.SOUTH);

        conectarEventos();
        refrescarTabla();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(780, 540);
        setLocationRelativeTo(null);
    }

}
