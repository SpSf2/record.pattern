package com.example;

/*  Metodo que recibe un objeto como parametro y muestra los detalles de dicho objeto
	 * utilizando la sentencia if y Pattern Machine con el metodo instanceof y además destructure
	 * del tipo record que es uno de los record pattern  */
public class App {
	
    static void imprimeDetalles(Object obj) {
    	
    	// en java 21 con record pattern, especificamente con destructure
    	if (obj instanceof Book(String titulo, String autor))  {
    		System.out.println("Titulo del Libro: " + titulo);
    		System.out.println("Autor del libro: " + autor);
    		
    	}
    }
    
    public static void main(String[] args)  {
    	// Crear un objeto de tipo record Book
    	
    	Book libro = Book.builder()
    			.title("Java es Bueno")
    			.author("Yo mismo")
    			.build();
    	
    	imprimeDetalles(libro);
    	
    /**
     * Estilo de comentario para javadoc.  Investigar
     */
    	
    // Los patrones Record tambien pueden ser anidados, permitiendo desestructurar gráficos
    //	de objetos complejos en un solo paso.
    	
    	Library library = Library.builder()
    			.name("Biblioteca de Madrid")
    			.bestseller(
    					Book.builder()
    					.title("Java Programming")
    					.author("John Doe")
    					.build()
    			)
    			.build();
    	
    	if (library instanceof Library(String nombre, Book(var titulo, var autor))) {
    		System.out.println("En la Biblioteca: " + nombre + ", El Bestseller es: " + titulo + ", por"
    				+ " el autor: " + autor);
			
		}
    }
}
