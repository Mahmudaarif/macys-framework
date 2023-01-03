package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void clickLogoElement01Test() {
		homePagge.clickLogoElement01();

	}
	
	@Test(enabled = false)
	public void sendKeysInSearchengineTest() throws InterruptedException {
		homePagge.sendKeysInSearchengine01();
	}
	
	@Test(enabled = false)
	public void clickSignInButtonTest() throws InterruptedException {
		homePagge.clickSignInButton();
	}
	
	@Test(enabled = true)
	public void sendKeysInSearchengine02Test() throws InterruptedException {
		homePagge.sendKeysInSearchengine02();
	}

}
