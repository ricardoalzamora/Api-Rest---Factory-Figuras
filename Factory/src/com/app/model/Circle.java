package com.app.model;

public class Circle implements ShapeInter {
	
	private double diameter;
	
	public Circle(double diameter) {
		this.diameter = diameter;
	}
	
	@Override
	public Double getDiameter() {
		return this.diameter;
	}

	@Override
	public String propertiesToString() {
		return "Circulo de " + diameter + " de diametro y " + getSurface() + " unidades de superficie.";
	}	
	
	@Override
	public Double getSurface() {
		return Math.PI*(Math.pow(diameter, 2)/4);
	}
	
}
