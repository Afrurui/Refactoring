import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static final double TASA_IVA = 0.21;
    private Cliente cliente;
    private Producto producto;
    private ArrayList<Producto> listaProductos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        listaProductos = new ArrayList<>();
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            subtotal = subtotal + listaProductos.get(i).getPrecio();
        }
        return subtotal;
    }

    public double calcularIVA() {
        return calcularSubtotal() * TASA_IVA;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return listaProductos;
    }

    public Producto agregarProducto() {
        return producto;
    }
}
