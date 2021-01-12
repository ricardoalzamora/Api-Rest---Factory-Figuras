package com.app.model.shapes;

import com.app.model.ShapeAbs;

public class Circle extends ShapeAbs {
	
	public Circle(double diameter) {
		super("circle");
		setDiameter(diameter);
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
