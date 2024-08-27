
public class Ps3 extends Ps4 {
	int a;
	
	public Ps3(int a) {
		super(a);
		this.a=a;
	}
	public int increment()
	{
		a=a+1;
		return a;
		
	}
	public int decrement()
	{
		a=a-1;
		return a;
		
	}


}
