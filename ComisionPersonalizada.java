public class ComisionPersonalizada implements EstrategiaComision {

    private final int cantidadLetrasPrimerNombre;

    public ComisionPersonalizada(String primerNombre) {
        this.cantidadLetrasPrimerNombre = primerNombre.length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * ((5.0 + cantidadLetrasPrimerNombre) / 100.0);
    }
}
