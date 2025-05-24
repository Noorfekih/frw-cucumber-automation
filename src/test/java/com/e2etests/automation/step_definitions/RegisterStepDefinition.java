package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	private RegisterPage registerPage = new RegisterPage();
	
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}
	
	@When("je clique sur le lien REGISTER")
	public void jeCliqueSurLeLienREGISTER() {
		registerPage.clickOnResgister();
			}

	@When("je saisi le Firstname {string}")
	public void jeSaisiLeFirstname(String name) {
		registerPage.fillFirstName(name);
	}
	
	@When("je saisie le Lastname {string}")
	public void jeSaisieLeLastname(String name) {
		registerPage.fillLastName(name);
	}
	
	@When("je saisie le Phone {string}")
	public void jeSaisieLePhone(String num) {
		registerPage.fillPhoneNumber(num);
	}
	
	@When("je saisie le Email {string}")
	public void jeSaisieLeEmail(String email) {
		registerPage.fillEmail(email);
	}
	
	@When("je saisie le Adress {string}")
	public void jeSaisieLeAdress(String adress) {
		registerPage.fillAddress(adress);
	}
	
	@When("je saisie le City {string}")
	public void jeSaisieLeCity(String city) {
		registerPage.fillCity(city);
	}
	
	@When("je saisie le State {string}")
	public void jeSaisieLeState(String state) {
		registerPage.fillState(state);
	}
	
	@When("je saisie le PostalCode {int}")
	public void jeSaisieLePostalCode(Integer postalCode) {
		registerPage.fillPostalCode(postalCode);
	}
	
	@When("je saisie le Country {string}")
	public void jeSaisieLeCountry(String countryName) {
		registerPage.SelectCountry(countryName);
	}
	
	@When("je saisie le Username {string}")
	public void jeSaisieLeUsername(String name) {
		registerPage.fillUserName(name);
	}

	@When("je saisie le Password d inscription {string}")
	public void jeSaisieLePasswordInscription(String password) {

		registerPage.fillPassword(password);
	}
	
	@When("je confirme le Password {string}")
	public void jeConfirmeLePassword(String password) {
		registerPage.fillToConfirmPassword(password);
	}
	
	@When("je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerPage.clickOnBtnEnvoyer();
	}
	
	@Then("je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPage(String text) {


	}



}
