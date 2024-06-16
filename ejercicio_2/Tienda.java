package ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private Diccionary<String, Producto> productos;

    public Tienda() {
        productos = new AVLTree<>();
    }

    public void comprarProducto(String codigo, String descripcion, int stock, int stockMinimo, double precio) {
        Producto producto = productos.search(codigo);
        if (producto != null) {
            producto.setStock(producto.getStock() + stock);
        } else {
            producto = new Producto(codigo, descripcion, stock, stockMinimo, precio);
            productos.insert(codigo, producto);
        }
    }

    public void venderProducto(String codigo, int cantidad) {
        Producto producto = productos.search(codigo);
        if (producto != null && producto.getStock() - cantidad >= producto.getStockMinimo()) {
            producto.setStock(producto.getStock() - cantidad);
        }
    }

    public void darDeBajaProducto(String codigo) {
        Producto producto = productos.search(codigo);
        if (producto != null && producto.getStock() <= producto.getStockMinimo()) {
            productos.remove(codigo);
        }
    }

    public List<Producto> reportePorEstado(String estado) {
        List<Producto> reporte = new ArrayList<>();
        obtenerProductosPorEstado(((AVLTree<String, Producto>) productos).root, estado, reporte);
        return reporte;
    }

    private void obtenerProductosPorEstado(Node<String, Producto> node, String estado, List<Producto> reporte) {
        if (node != null) {
            obtenerProductosPorEstado(node.getLeft(), estado, reporte);
            if (node.getValue().getEstado().equals(estado)) {
                reporte.add(node.getValue());
            }
            obtenerProductosPorEstado(node.getRight(), estado, reporte);
        }
    }

    public List<Producto> reporteProductosMasVendidos() {
        // Implementar lógica para obtener productos más vendidos
        return new ArrayList<>();
    }
}
