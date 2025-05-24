package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	private ConfigFileReader configFileReader;
	@FindBy(how = How.CSS, using = "a[href='register.php']")
	public static WebElement linkResgister;
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.NAME, using = "userName")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address1;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	@FindBy(how = How.NAME, using = "email")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnEnvoyer;
	@FindBy(how = How.XPATH, using = "//tbody/tr[4]/td[1]/table[1]")
	public static WebElement confirmRegistring;
	

	public RegisterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void clickOnResgister() {
		linkResgister.click();
	}

	public void fillFirstName(String name) {
		firstName.sendKeys(name);
	}

	public void fillLastName(String name) {
		lastName.sendKeys(name);
	}

	public void fillPhoneNumber(String num) {
		phone.sendKeys(num);
	}

	public void fillEmail(String email) {
		userName.sendKeys(email);
	}

	public void fillAddress(String adress) {
		address1.sendKeys(adress);
	}

	public void fillCity(String cityname) {
		city.sendKeys(cityname);
	}

	public void fillState(String statename) {
		state.sendKeys(statename);
	}

	public void fillPostalCode(int code) {
		postalCode.sendKeys(String.valueOf(code));
	}

	public void SelectCountry(String countryName) {
		Select select = new Select(country);
		select.selectByValue(countryName);
	}

	public void fillUserName(String name) {
		email.sendKeys(name);
	}

	public void fillPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void fillToConfirmPassword(String pwd) {
		confirmPassword.sendKeys(pwd);
	}

	public void clickOnBtnEnvoyer() {
		btnEnvoyer.click();
	}

}
