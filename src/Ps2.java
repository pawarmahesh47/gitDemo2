import org.testng.annotations.Test;

public class Ps2 extends Ps1 {


	@Test
	public void getdata1() {
		//int a=3;
		getdata();
		Ps3 ps= new Ps3(3);
		System.out.println(ps.increment());
		System.out.println(ps.decrement());
		System.out.println(ps.multiplythree());
		System.out.println(ps.multiplytwo());
	}
	// public static void main(String[] args){

	// }

}
