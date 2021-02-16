package Pojjo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo extends BaseClass {

	public pojo() {


		PageFactory.initElements(driver, this);	
	}
@FindBy(xpath="//input[@id='email']")
private WebElement user;


@FindBy(xpath="//input[@id='pass']")
private WebElement pass;


@FindBy(xpath="//button[@id='u_0_b']")
private WebElement btn;

@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement frgnt;

@FindBy(xpath="(//input[@name='email'])[2]")

private WebElement phnnum;

@FindBy(xpath="//button[@name='did_submit']")

private WebElement searchbutton;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getBtn() {
	return btn;
}

public WebElement getFrgnt() {
	return frgnt;
}

public WebElement getPhnnum() {
	return phnnum;
}

public WebElement getSearchbutton() {
	return searchbutton;
}
	
	
	
}
