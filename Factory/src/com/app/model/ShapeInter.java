package com.app.model;
/**
 * Interfaz funcinal de figura
 * @author Ricardo Alzamora
 *
 */
public interface ShapeInter {
	
	public String propertiesToString();
	
	public Double getSurface();
	
	public default Double getBase() {
		return null;
	}
	
	public default Double getHeight() {
		return null;
	}
	
	public default Double getDiameter() {
		return null;
	}

}
