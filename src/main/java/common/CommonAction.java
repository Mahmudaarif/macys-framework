package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class CommonAction {
	public static void clickElement(WebElement element) throws NoSuchElementException, NullPointerException{
		element.click();

	}
	
	public static void inputtext(WebElement element, String value) {
		try {
		element.sendKeys(value);
		}catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
