package com.af.stepdefinations;

import com.af.helper.CommonFunctions;
import com.af.pageobjects.HomePage;
import com.af.pageobjects.ProductPage;
import com.af.testbase.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinations extends TestBase{
	
	HomePage homePage = new HomePage(driver);
	CommonFunctions waitHelper = new CommonFunctions(driver);
	
	@When("^I click on Spend & Save button$")
	public void click_on_discussion_link() throws Throwable {
		homePage.clickSpendAndSave();
	}
	
	
}
