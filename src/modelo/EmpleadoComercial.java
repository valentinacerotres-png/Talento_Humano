package modelo;

public class EmpleadoComercial extends EmpleadoBase {
    private double porcentajeComision;

    public EmpleadoComercial(String cedula, String nombre, double salarioBase, double PorcentajeComision) {
        super(cedula, nombre, salarioBase);
        this.porcentajeComision = porcentajeComision;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    @Override
    public double calcularSalarioTotal() {
        double base = getSalarioBase();
        return base + (base * porcentajeComision / 100);
    }

    @Override
    public String getTipo() {
        return "Comercial";
    }
}
