package pruebaColecciones3.pruebaColecciones3.pojos;

import java.math.BigDecimal;
import java.util.Objects;

import pruebaColecciones3.pruebaColecciones3.Enum.Tax;

public class Product implements Comparable<Product>{
	
	String nombre;
	BigDecimal precio;
    Tax tax;
	
	public Product() {
		super();
	}

	public Product(String nombre, BigDecimal precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Product(String nombre, BigDecimal precio, Tax tax) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tax = tax;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
		

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Product [nombre=" + nombre + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Product o) {
		int ordenado=this.nombre.compareTo(o.getNombre());
		return ordenado;
	}

    
	
	
	

}
