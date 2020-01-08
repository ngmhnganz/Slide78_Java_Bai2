package lop1k.com.model;

public class Circle extends Point{
	private Double radius;

	public Double getRadius() {
		return radius;
	}

	@Override
	public Integer getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}

	@Override
	public void setX(Integer x) {
		// TODO Auto-generated method stub
		super.setX(x);
	}

	@Override
	public Integer getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}

	@Override
	public void setY(Integer y) {
		// TODO Auto-generated method stub
		super.setY(y);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	public Double getDiameter() {
		return 2*radius;
	}
	public Double getCircumference() {
		return 2*radius*3.14;
	}
	public Double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "[Diameter= " + getDiameter() + "; Circumference= "+getCircumference()+"; Area= "+getArea()+"]";
	}

	public Circle(Integer x, Integer y, Double radius) {
		super(x, y);
		this.radius = radius;
	}

	public Circle(Integer x, Integer y) {
		super(x, y);
	}
	
	
}
