package com.app.model;

public class Square extends CommonShapeAbs {
	
	public Square(double base, double height) {
		super(base, height);
	}
	
	public Square(double side) {
		super(side, side);
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
