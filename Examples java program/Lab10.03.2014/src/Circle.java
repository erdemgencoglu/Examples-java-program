
public class Circle {

	private double radius;

	public Circle()
	{
		
		
	}
	public void  Circle1(double Radius) {
		this.radius = Radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double Radius) {
		this.radius = Radius;
	}
	public double getArea()//Daire Alan hesaplamas�
	{
		
		return Math.PI*radius*radius;	
	}
	public double getPerimeter()
	{
		
		return 2*Math.PI*radius;
	}
	public int compareArea(Square sqr){
	if (sqr.getArea()==getArea()) {
		return 0;
	}
	else if (sqr.getArea()<getArea()) {
		return 1;
	}else
		return -1;//Cicrle �n compare area s�n� yaz may� unutmu�un
	}

}
