package com.app;

import com.app.model.shapes.Circle;
import com.app.model.ShapeInter;
import com.app.model.shapes.Square;
import com.app.model.shapes.Triangle;

public class ShapeFactory {
	
	public static ShapeInter createShape(String className, double base, double height) {
		switch (className) {
		case "square":
			return new Square(base, height);
		
		case "triangle":
			return new Triangle(base, height);

		default:
			return null;
		}
	}
	
	public static ShapeInter createShape(String className, double diameter) {
		switch (className) {
		case "circle":
			return new Circle(diameter);

		default:
			return null;
		}
	}

}
