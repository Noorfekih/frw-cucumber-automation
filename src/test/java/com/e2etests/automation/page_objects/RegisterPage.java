package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
	@FindBy(how = How.CSS, using = "a[href='register.php']")
	public static WebElement linkResgister;

	public void clickOnResgister() {

		linkResgister.click();
	}

}
