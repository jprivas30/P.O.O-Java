package com.generation.clase2102;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.tomcat.util.buf.CharChunk.CharInputChannel;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.SpringCacheAnnotationParser;
import org.springframework.cache.support.NullValue;

import com.generation.clase2102.models.Perro;

@SpringBootApplication
public class Clase2102Application {



	public static void main(String[] args) {
/* 
//Crear un perro por defecto

	Perro perroDefault = new Perro();

//Crear un perro con todos los atributos

	Perro perroSalchicha = new Perro("Salchicha", "Cafe", 40.4, "Pelo Duro", 'F', 775757);

//toString(); para mostrar objeto al usuario 

	System.out.println( perroDefault.toString());
	System.out.println(perroSalchicha.toString());

//Para cambiar el valor dentro del objeto

	perroDefault.setRaza("quiltro");
	perroDefault.setColor("Blanco");

	System.out.println( perroDefault.toString());

//Para obtener un dato especifico

	System.out.println(perroSalchicha.getTamanio());

//Para inyectar objetos a un array

ArrayList <Perro> misPerros = new ArrayList<Perro>();
misPerros.add(perroSalchicha);
misPerros.add(perroDefault);
System.out.println(misPerros);

*/


//-------------------------------------------EJERCICIO CLASES---------------------------------------------------

//PROGRAMA QUE PERMITA AGREGAR ELEMENTOS POR EL USUARIO Y GUARDARLOS

//DECLARACION DE VARIABLES

Integer cantidadPerros;
Scanner teclado = new Scanner(System.in);
ArrayList<Perro> nuevPerros = new ArrayList<Perro>();

//PEDIR NUMERO DE PERROS QUE VA A AGREGAR AL USUARIO

System.out.print("Indique la cantidad de Perros que va a ingresar: ");
cantidadPerros = teclado.nextInt();

//BUCLE PARA ITERAR LOS DATOS Y AGREGARLO A UN USUARIO

	for(int i = 1; i<= cantidadPerros; i++){
		Perro nuevoPerro= new Perro();
		teclado.nextLine();
		System.out.print("Indique la raza del Perro " + i + " : ");	
		nuevoPerro.setRaza(teclado.nextLine());
		System.out.print("Indique el Color del Perro "+i + " : ");
		nuevoPerro.setColor(teclado.nextLine());
		System.out.print("Indique el Tamaño del Perro "+i + " : ");
		nuevoPerro.setTamanio(teclado.nextDouble());
		teclado.nextLine();
		System.out.print("Indique Tipo de Pelaje del Perro "+i + " : ");
		nuevoPerro.setPelaje(teclado.nextLine());
		System.out.print("Indique el Sexo del Perro "+i + " : ");
		nuevoPerro.setSexo(teclado.nextLine().charAt(0));
		System.out.print("Indique el Numero de Identificacion del chip del Perro "+i + " : ");
		nuevoPerro.setChip(teclado.nextInt());
	 	nuevPerros.add(nuevoPerro);

	}

//PARA MOSTRAR EN LA CONSOLA AL USUARIO LOS DATOS INGRESADOS 

	System.out.println("Los Perros Ingresados son : ");
	System.out.println(nuevPerros);

//SE CIERRA EL TECLADO 

	teclado.close();
}
}


