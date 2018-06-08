package model;

public class Circle {
	
	private double radius;
	
	// getters & setters

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius){
		if(radius<0) throw new IllegalArgumentException("vous avez entr� un rayon n�gatif");
		this.radius = radius;
	}

	// constructeur
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	

}
