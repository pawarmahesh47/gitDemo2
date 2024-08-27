class Banking
{
	public void banking()
	{
		System.out.println("Banking task Started........");
		
		for(int i=0; i<3; i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Banking.........");
		}
		System.out.println("Banking completed");
		System.out.println("");
	}
}

class Cal
{
	public void cal()
	{
		System.out.println("Calution task Started........");
		for(int i=0; i<3; i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Calulating.........");
		}
		System.out.println("Calculation completed");
		System.out.println("");
	}
}

class Print
{
	public void print()
	{
		System.out.println("Printing task Started........");
		for(int i=0; i<3; i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing.........");
		}
		System.out.println("Priting completed");
		System.out.println("");
	}
}
public class BakingLau {

	public static void main(String[] args) {
		Banking b = new Banking();
		Cal c = new Cal();
		Print p = new Print();
		
		b.banking();
		c.cal();
		p.print();

	}

}
