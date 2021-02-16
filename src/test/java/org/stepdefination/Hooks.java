package org.stepdefination;

import org.base.BaseClass;

import cucumber.api.java.Before;


public class Hooks extends BaseClass {

	@Before
	public void Beforeexecution() {
		lunchbro();
	}

	@Before
	public void lastexecution() {

		driver.manage().window().maximize();
	}

}
