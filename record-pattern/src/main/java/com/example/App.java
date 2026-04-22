package com.example;

	/*  Metodo que recibe un objeto como parametro y muestra los detalles de dicho objeto
	 * utilizando la sentencia if y Pattern Machine con el metodo instanceof y además destructure
	 * del tipo record que es uno de los record pattern  */
public class App {
	
    static void imprimeDetalles(Object obj) {
    	
    	if (obj instanceof Book book)  {
    		System.out.println("Titulo del Libro: " + book.title());
    		System.out.println("Autor del libro: " + book.author());
    		
    	}
    }
    
    public static void main(String[] args)  {
    	// Crear un objeto de tipo record Book
    	
    	Book libro = Book.builder()
    			.title("Java es Bueno")
    			.author("Yo mismo")
    			.build();
    	
    	imprimeDetalles(libro);
    }
}
