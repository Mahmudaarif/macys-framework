package pages;

import org.openqa.selenium.WebDriver;
import static common.CommonAction.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagge {
	 WebDriver driver;

	public HomePagge(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='header-logo__image']")
	WebElement logoElement01;
	
	
	public void clickLogoElement01() {
		logoElement01.click();
		
	}
	
	
	@FindBy(xpath = "//input[@id='globalSearchInputField']")
	WebElement searchEngin01;
	
	
	
	public void sendKeysInSearchengine01() throws InterruptedException {
		searchEngin01.sendKeys("bag");
		Thread.sleep(5000);
	}
	
	@FindBy(xpath = "//span[text()='Sign In']")
	WebElement signinButton;

	
	public void clickSignInButton() throws InterruptedException {
		clickElement(signinButton);
		Thread.sleep(3000);
	}
	
	public void sendKeysInSearchengine02() throws InterruptedException {
		inputtext(searchEngin01, "Shoe");
		Thread.sleep(0);
	}
	
	//********(Home work number3)**********
	
	@FindBy(id = "target_sign_in_btn")
	WebElement signinButton1;

	public void clickSignInButton1() throws InterruptedException {
		clickSignInButton1();
		Thread.sleep(4000);			
	}
	
	
	
	
	
	
	
		
	
}
