package com.af.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.af.helper.CommonFunctions;
import com.af.pageobjects.HomePage;
import com.af.pageobjects.ProductPage;
import com.af.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ProductPageStepDefinitions extends TestBase {

	HomePage homePage = new HomePage(driver);
	ProductPage productPage = new ProductPage(driver);
	CommonFunctions waitHelper = new CommonFunctions(driver);
	
	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}
	
	@Then("^I verify two card products present on product page$")
	public void verify_two_card_products() throws Throwable {
		productPage.verifyCardProducts();
	}
	
	@Then("^I click on Get Aspiration Product$")
	public void click_on_Get_Aspiration_Modal() throws Throwable {
		productPage.clickGetAspirationBtn();
	}
	
	@Then("^I should see a modal containing input field$")
	public void verify_modal_containing_input_field() throws Throwable {
		productPage.verifyInputModalOnGetAspiration();
	}
	
	@Then("^I click on Get Aspiration Plus Product$")
	public void click_on_Get_Aspiration_Plus_Modal() throws Throwable {
		productPage.clickGetAspirationPlusBtn();
	}
	
	@Then("^I should see yearly and monthly modals$")
	public void verify_yearly_and_monthly_modals() throws Throwable {
		productPage.verifyGetAspirationPlusModals();
	}
	
	@Then("^I should see the cost of yearly as \"([^\"]*)\"$")
	public void verify_yearly_cost(String arg1) throws Throwable {
		productPage.verifyYearlyCost(arg1);
	}
	
	@Then("^I should see the cost of monthly as \"([^\"]*)\"$")
	public void verify_monthly_cost(String arg1) throws Throwable {
		productPage.verifyMonthlyCost(arg1);
	}

	
}