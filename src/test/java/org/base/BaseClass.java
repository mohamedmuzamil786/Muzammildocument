package org.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static JavascriptExecutor js;
	public static WebDriver driver;
	public static 	Actions a;

	public static void lunchbro() {
	
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
public static void openurl(String h) {

	driver.get(h);
}
public static void fillthevalue(WebElement element, String text) {
	element.sendKeys(text);

}
public static void btnclick(WebElement element) {

	
	element.click();
	
}
public static void Scrolldown(WebElement element) {
	
js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)", element);
}
public static void Scrollup(WebElement element) {
	
js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(false)", element);
}

public static void gettext(WebElement element) {
	element.getText();
 
}

public static void Movetoelement(WebElement element) {

	 a = new Actions(driver);
	a.moveToElement(element).perform();
}
public static String getattribute(WebElement element) {
return element.getAttribute("innerHTML");
}
	public static void jsbtnclick(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		}
		
		
	}
	


