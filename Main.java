public class Main {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(
                "Santiago",
                10000.00,
                new ComisionEstandar()
        );

        vendedor.mostrarDetalle();
    }
}
