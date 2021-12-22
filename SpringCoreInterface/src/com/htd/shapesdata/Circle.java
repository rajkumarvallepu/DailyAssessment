package com.htd.shapesdata;

import com.htd.shapes.*;

public class Circle implements ShapesMeasurements {
	private Double radius;

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*this.radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
