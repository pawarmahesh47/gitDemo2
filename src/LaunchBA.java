
public class LaunchBA {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Banking task Started........");
		
		for(int i=0; i<3; i++)
		{
			Thread.sleep(2000);
			System.out.println("Banking.........");
		}
		System.out.println("Banking completed");
		System.out.println("");
		
		System.out.println("Calution task Started........");
		for(int i=0; i<3; i++)
		{
			Thread.sleep(2000);
			System.out.println("Calulating.........");
		}
		System.out.println("Calculation completed");
		System.out.println("");
		
		System.out.println("Printing task Started........");
		for(int i=0; i<3; i++)
		{
			Thread.sleep(2000);
			System.out.println("Printing.........");
		}
		System.out.println("Priting completed");
		System.out.println("");
		

	}

}
