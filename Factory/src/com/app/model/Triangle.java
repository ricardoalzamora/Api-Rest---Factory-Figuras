package com.app.model;

public class Triangle extends CommonShapeAbs {
	
	public Triangle(double base, double height) {
		super(base, height);
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
