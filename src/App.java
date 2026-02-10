public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("INICIANDO SISTEMA DE PEDIDOS v2.0 (Refactorizado)...");
        // --- CLIENTE 1 ---
        Cliente cliente1 = new Cliente("TechSolutions SL", "B12345678", "Calle Industria 55");
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(new Producto("Servidor Dell", 2500.0));
        pedido1.agregarProducto(new Producto("Windows Server", 800.0));

 
    }
}
