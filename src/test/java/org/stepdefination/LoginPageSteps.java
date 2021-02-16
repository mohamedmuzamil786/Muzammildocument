package org.stepdefination;


import org.base.BaseClass;
import org.omg.PortableServer.POA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pojjo.pojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps extends BaseClass {
pojo pj;
	@Given("user has to lunch chrome and hit the url")
	public void user_has_to_lunch_chrome_and_hit_the_url() {
		lunchbro();
		driver.get("https://www.facebook.com/");
		
	}

	@When("user has enter the username and password")
	public void user_has_enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		pj= new pojo();
		fillthevalue(pj.getUser(), "mohamed");
		fillthevalue(pj.getPass(), "muzamil");
		
		
	}

	@When("click the login button")
	public void click_the_login_button() {

		btnclick(pj.getBtn());
	}

	@Then("user unable to enter the homepage")
	
	public void user_unable_to_enter_the_homepage() {
	    System.out.println("unable to login");
	}

	@When("user has to click the forgot password link")
	public void user_has_to_click_the_forgot_password_link() {
		pj= new pojo();
			jsbtnclick(pj.getFrgnt());
	}

	@When("user has to enter the mobile number")
	public void user_has_to_enter_the_mobile_number() {
		 
		  fillthevalue(pj.getPhnnum(), "9500588568");
	}

	@When("Click thr search button")
	public void click_thr_search_button() {
		
		 btnclick(pj.getSearchbutton());
			
	}

	@Then("user has to navigate the otp page")
	public void user_has_to_navigate_the_otp_page() {
		String url = driver.getCurrentUrl();
		System.out.println("url");
	}
	

@When("User enter {string} and {string}")
public void user_enter_and(String emlid, String paswd) {
	pj= new pojo();
	fillthevalue(pj.getUser(), emlid);
	fillthevalue(pj.getPass(), paswd);
	
	
}

@When("User Click the bUtton")
public void user_Click_the_bUtton() {
    btnclick(pj.getBtn());


}

@Then("User Should be invalid credientials page")
public void user_Should_be_invalid_credientials_page() {
   
System.out.println("ivalid page");


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
