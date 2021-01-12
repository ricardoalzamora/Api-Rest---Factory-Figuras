package com.app.model;

public abstract class ShapeAbs implements ShapeInter {
    protected Double base = null;
    protected Double height = null;
    protected Double diameter = null;
    protected String typeShape;

    public ShapeAbs(String typeShape){
        this.typeShape = typeShape;
    }

    @Override
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }
}
