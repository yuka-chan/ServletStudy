package model;

import java.io.Serializable;

public class Health implements Serializable {

	private double height, weight, bmi;
	private String bodyType;

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getBmi() {
		return bmi;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	};
	
	
}
