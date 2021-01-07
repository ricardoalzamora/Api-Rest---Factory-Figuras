package com.app.model;
/**
 * Figuras comunes con bases y alguras
 * @author Ricardo Alzamora
 *
 */
public abstract class CommonShapeAbs implements ShapeInter {

	protected double base;
	protected double height;
	
	public CommonShapeAbs(double base, double altura) {
		this.base = base;
		this.height = altura;
	}

	@Override
	public Double getBase() {
		return this.base;
	}

	@Override
	public Double getHeight() {
		return this.height;
	}	

}
