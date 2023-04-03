package GUIA1;

public class Producto {
	  /*
     * En un nuevo proyecto crear una clase de nombre Producto con los atributos
     * código de tipo
     * entero, descripción un String, precio de tipo double y stock de tipo entero;
     * un constructor
     * que permita inicializar todos sus atributos y los métodos get y set. Desde el
     * método main
     * de clase principal del proyecto instanciar un Producto y luego mostrar por
     * consola el estado
     * de todos sus atributos.
     */

    int codigo;
    String descripción;
    double precio;
    int stock;
    
    public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


    public Producto() {
        codigo = 0;
        descripción = "";
        precio = 0;
        stock = 0;
    }

    public void setProducto(int Codigo, String Descripción, double Precio, int Stock) {
        codigo = Codigo;
        descripción = Descripción;
        precio = Precio;
        stock = Stock;

    }

    public void getallProducto() {
        System.out.println(codigo + " " + descripción + " " + precio + " " + stock);
    }

    public static void main(String[] args) {
    	Producto Cocacola = new Producto();
        Cocacola.setProducto(231, "gaceosa", 700, 999);
        Cocacola.getallProducto();
    }
}
