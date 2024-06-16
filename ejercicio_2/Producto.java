package ejercicio_2;

public class Producto {
    private String codigo;
    private String descripcion;
    private int stock;
    private int stockMinimo;
    private double precio;
    private String estado;

    public Producto(String codigo, String descripcion, int stock, int stockMinimo, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.precio = precio;
        this.estado = stock >= stockMinimo ? "suficiente" : "insuficiente";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        actualizarEstado();
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
        actualizarEstado();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    private void actualizarEstado() {
        this.estado = stock >= stockMinimo ? "suficiente" : "insuficiente";
    }
}
