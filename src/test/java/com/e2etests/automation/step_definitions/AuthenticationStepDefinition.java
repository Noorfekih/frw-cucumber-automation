package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage = new AuthenticationPage();
	
	public AuthenticationStepDefinition() {
	this.authenticationPage = new AuthenticationPage();
	}
	
	@Given("je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authenticationPage.goToUrl();

	}

	@When("je saisi le Username {string}")
	public void jeSaisiLeUsernameTest(String name) {
		authenticationPage.fillUserName(name);
	}

	@When("je saisie le Password {string}")
	public void jeSaisieLePasswordTest(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("je clique sur le bouton Submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authenticationPage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page d acceuil {string}")
	public void jeMeRedirigeVersLaPageDAcceuil(String text) {
		String msg = authenticationPage.welcomeMsg.getText();
		Assert.assertEquals(text, msg);

	}

}
