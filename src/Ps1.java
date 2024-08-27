import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ps1 {

	
	public void getdata() {
		
		System.out.println("In PS1 class");
	}
	@BeforeMethod
	public void beforeRun() {

		System.out.println("Run 1st");
	}

}
