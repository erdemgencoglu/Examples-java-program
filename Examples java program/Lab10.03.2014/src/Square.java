
public class Square {

	double length;
	public Square(){
	
	
	}	
	public void Square1(double length) {

		this.length = length;
	}


	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea(){//Alan hesaplama
	
		return length*length;	
	}
	public double getPerimeter(double A){
		
		return 4*length;
	
	}
	public int CompareArea(Circle crcl){
		if (crcl.getArea()==getArea()) {
			return 0;
		}
		else if (crcl.getArea()<getArea()) {
			return 1;
		}else
			return -1;
	}
}
