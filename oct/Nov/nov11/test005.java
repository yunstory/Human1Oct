package nov11;

class Girl{
	
	protected String name;
	
	public Girl(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("�׳�� �ڹ� �ʺ����̴�.");
	}
	
}
class GoodGirl extends Girl{
	
	public GoodGirl(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println(name + "�� �ڹٸ� �� �ȴ�");
	}
	
}
class BestGirl extends GoodGirl{
	
	public BestGirl(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println(name + "�� �ڹٸ� �����ϰ� �� �ȴ�");
	}
}

public class test005 {

	public static void main(String[] args) {
		
		Girl g1 = new Girl("");
		Girl g2 = new GoodGirl("�׳�");
		GoodGirl gg = new BestGirl("�׳�");

		g1.show();
		g2.show();
		gg.show();
		
		System.out.println("\n----------------\n");
		
		
		Girl[] girls = 
			{ new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����")};
		
		for(Girl g:girls) 
			g.show();
		
		
		
	}

}
