package com.app.model;

public class Triangle extends ShapeAbs {
	
	public Triangle(double base, double height) {
		super("triangle");
		setBase(base);
		setHeight(height);
	}

	@Override
	public String propertiesToString() {
		return "Triangulo de " + base + " unidades de base, " + height + " unidades de altura, y " + getSurface() + " de superficie.";
	}

	@Override
	public Double getSurface() {
		return base*height/2;
	}

}
