package com.app;

import com.app.model.ShapeInter;

public class Main {

	public static void main(String[] args) {
		
		/*CUADRADO*/
		ShapeInter cuadrado = ShapeFactory.createShape("square", 3,  3);
		System.out.println("CUADRADO:");
		System.out.println("Base: " + cuadrado.getBase());
		System.out.println("Altura: " + cuadrado.getHeight());
		System.out.println("Diametro: " + cuadrado.getDiameter());
		System.out.println(cuadrado.propertiesToString());
		System.out.println("\n");
		
		/*TRIANGULO*/
		ShapeInter triangulo = ShapeFactory.createShape("triangle", 3,  3);
		System.out.println("TRIANGULO:");
		System.out.println("Base: " + triangulo.getBase());
		System.out.println("Altura: " + triangulo.getHeight());
		System.out.println("Diametro: " + triangulo.getDiameter());
		System.out.println(triangulo.propertiesToString());
		System.out.println("\n");
		
		/*CIRCULO*/
		ShapeInter circulo = ShapeFactory.createShape("circle", 3);
		System.out.println("CIRCULO:");
		System.out.println("Base: " + circulo.getBase());
		System.out.println("Altura: " + circulo.getHeight());
		System.out.println("Diametro: " + circulo.getDiameter());
		System.out.println(circulo.propertiesToString());	
		
		
	}

}
