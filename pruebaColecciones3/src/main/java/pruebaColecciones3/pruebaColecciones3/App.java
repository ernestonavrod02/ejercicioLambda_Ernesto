package pruebaColecciones3.pruebaColecciones3;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
import java.util.stream.Stream;

import pruebaColecciones3.pruebaColecciones3.Enum.Tax;
import pruebaColecciones3.pruebaColecciones3.pojos.*;
/**
 * Hello world!
 *
 */
public class App 
{
	
	public static BigDecimal total=new BigDecimal("0");

	
    public static void main( String[] args )
    {
    	    List<Product> shoppingCart = List.of(
    			new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
    			new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
    			new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
    			new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
    			new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
    			new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
    	
    	    //4 10 21
    	       
    	    shoppingCart.stream().forEach((pro)-> {
    	    	 total = total.add(pro.getPrecio().add(pro.getPrecio().multiply(pro.getTax().getPrecio())));
    	    });
    	    
    	    
    	    System.out.println("--> "+total);
    	    
    	    Stream <Product> productos=shoppingCart.stream().filter(producto->producto.getNombre().startsWith("C")).sorted();
    	    productos.forEach((p)-> {
    	    	System.out.println(p.getNombre());
    	    });

    }
}
