package module6;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 0)
	public void Vishali() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 2)
	public void Naga() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 12)
	public void Virendra() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 33)
	public void Sudip() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 45)
	public void Sachin() {
		System.out.println("This is the Test Case 5");
	}
}
