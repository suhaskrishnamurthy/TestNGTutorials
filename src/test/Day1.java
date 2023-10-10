package test;

import org.testng.annotations.Test;

public class Day1 {
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Hello World");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}

}
