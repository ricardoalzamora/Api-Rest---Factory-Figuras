package com.app;

import com.app.model.Circle;
import com.app.model.ShapeInter;
import com.app.model.Square;
import com.app.model.Triangle;

public class ShapeFactory {
	
	public static ShapeInter createCommonShape(String className, double base, double height) {
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
