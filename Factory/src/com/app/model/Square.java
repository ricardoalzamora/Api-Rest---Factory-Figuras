package com.app.model;

public class Square extends ShapeAbs {
	
	public Square(double base, double height) {
		super("square");
		setBase(base);
		setHeight(height);
	}
	
	public Square(double side) {
		super("square");
		setBase(side);
		setHeight(side);
	}

	@Override
	public String propertiesToString() {
		return "Cuadrado de " + base + " unidades de base, " + height + " unidades de altura, y " + getSurface() + " de superficie.";
	}

	@Override
	public Double getSurface() {
		return base*height;
	}

}
