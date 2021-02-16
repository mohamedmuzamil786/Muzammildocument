package org.com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	 static WebDriver driver;

@Given("user has to lunch the chrome and hit the FB url")
public void user_has_to_lunch_the_chrome_and_hit_the_FB_url() {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	
}

@When("user has enter the username and password")
public void user_has_enter_the_username_and_password(io.cucumber.datatable.DataTable d) {
	List<List<String>> l = d.asLists(); 
	
	
	WebElement user = driver.findElement(By.id("email"));
	  user.sendKeys(l.get(0).get(0));
	  WebElement passwrd = driver.findElement(By.id("pass"));
		passwrd.sendKeys(l.get(0).get(1));
}

@When("click the login button")
public void click_the_login_button() {
   
		WebElement btn = driver.findElement(By.id("u_0_b"));
		btn.click();
}

@Then("user unable to enter the homepage")
public void user_unable_to_enter_the_homepage() {
	System.out.println("unable to login");	
	
}

}
