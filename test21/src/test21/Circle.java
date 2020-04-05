package test21;

public class Circle 
{
	
	private double radius;
	
	public Circle(){}
	
	public Circle(double r)
	{
		setRadius(r);
	}
	
	public void setRadius(double r)
	{
		if(r <= 0)
		{
			System.out.println(r + " is not negative");
		}
		else
		{
			radius = r;
		}
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double calArea()
	{
		return radius * radius * 3.14;
	}
	
	public double calCircumference()
	{
		return radius * 2 * 3.14;
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(-3);
		System.out.println(c1.getRadius());
		System.out.print("Dien tich 1 = ");
		System.out.println(c1.calArea());
		System.out.print("Chu vi 1 = ");
		System.out.println(c1.calCircumference());
		
		Circle c2 = new Circle(5);
		System.out.println(c2.getRadius());
		System.out.print("Dien tich 2 = ");
		System.out.println(c2.calArea());
		System.out.print("Chu vi 2 = ");
		System.out.println(c2.calCircumference());

	}

}
