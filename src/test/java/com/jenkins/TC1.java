package com.jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC1 {
	@Test
	public void m1() {
		Reporter.log("m1 is passed",true);
	}

}
