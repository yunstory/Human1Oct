package nov11;

class Circle{
	
	public double radius = 0;
	
	public double area() {
		return (radius * radius) * Math.PI;
	}
	
	public double periphery() {
		return 2 * radius * Math.PI;
	}

	public Circle() {}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
}

class CirclePillar extends Circle{
	public double pillar = 0;
	
	public double volume() {
		return area() * pillar;
	}
	
	public CirclePillar() {}

	public CirclePillar(double pillar, double radius) {
		super(radius);
		this.pillar = pillar;
	};
	
	
	
}



public class test003 {

	public static void main(String[] args) {

		Circle c = new Circle(10);
		System.out.println(c.area());
		System.out.println(c.periphery() + "\n");
		
		c.radius = 20;
		System.out.println(c.area());
		System.out.println(c.periphery());
		System.out.println("\n------------------------\n");
		
		
		CirclePillar cp = new CirclePillar(1,10);
		System.out.println(cp.volume()+ "\n");
		
		cp.pillar = 2; cp.radius =20;
		System.out.println(cp.volume());
		
		
	}

}
