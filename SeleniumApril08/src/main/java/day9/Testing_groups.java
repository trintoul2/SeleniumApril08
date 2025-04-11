package day9;

import org.testng.annotations.Test;

public class Testing_groups {

	@Test(groups= {"release specific"}, enabled = false)
	public void electronics() {
		System.out.println("electronics");
	}
	
	@Test(groups= {"release specific"})
	public void mobile() {
		System.out.println("mobile");
	}
	
	@Test(groups= {"low priority"})
	public void kidswear() {
		System.out.println("kidswear");
	}
	
	@Test(groups= {"low priority"})
	public void homeneeds() {
		System.out.println("homeneeds");
	}
	
}
