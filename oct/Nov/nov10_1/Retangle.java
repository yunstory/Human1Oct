package nov10_1;

public class Retangle {

	
	private double width = 100;
	private double height = 100;
	
	private static Retangle instance = new Retangle();
	
	public static Retangle getInstance() {
		return instance;
	}

	
	public double area() {
		return width * height;
	}

	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		if(this.width<0)this.width=0; //분수 들어오는 걸 막음 :(( ,, 
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		if(this.height<0)this.height=0;
	}
	
	public Retangle() {} //아래의 필수 코스 랄까 

	public Retangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		if(this.width<0)this.width=0;
		if(this.height<0)this.height=0;
	}

	
	@Override
	public String toString() {
		return "width=" + width + ", height=" + height ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangle other = (Retangle) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	
	
}
