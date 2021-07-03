package com.af.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.af.helper.CommonFunctions;

public class ProductPage extends CommonFunctions {

	private WebDriver driver;

	@FindBy(xpath = "//h2[text()='Aspiration']")
	public WebElement aspiration;

	@FindBy(xpath = "//h2[text()='Aspiration Plus']")
	public WebElement aspirationPlus;

	@FindBy(xpath = "(//button[contains(text(),'Get Aspiration')])[1]")
	public WebElement getAspiration;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement getAspirationModal;
	
	@FindBy(xpath = "//button[contains(text(),'Get Aspiration Plus')]")
	public WebElement getAspirationPlus;
	
	@FindBy(xpath = "//h3[contains(text(),'Yearly')]")
	public WebElement getAspirationPlusYearlyModal;
	
	@FindBy(xpath = "//h3[contains(text(),'Monthly')]")
	public WebElement getAspirationPlusMonthlyModal;
	
	@FindBy(xpath = "//h3[contains(text(),'Yearly')]/following-sibling::p/b")
	public WebElement getAspirationPlusYearlyCost;
	
	@FindBy(xpath = "//h3[contains(text(),'Monthly')]/following-sibling::p/b")
	public WebElement getAspirationPlusMonthlyCost;

	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductPage verifyCardProducts(){
		isElementDisplayed(this.aspiration);
		isElementDisplayed(this.aspirationPlus);
		return this;
	}
	
	public ProductPage clickGetAspirationBtn(){
		clickElement(this.getAspiration);
		return this;
	}
	
	public ProductPage verifyInputModalOnGetAspiration(){
		isElementDisplayed(this.getAspirationModal);
		return this;
	}
	
	public ProductPage clickGetAspirationPlusBtn(){
		clickElement(this.getAspirationPlus);
		return this;
	}
	
	public ProductPage verifyGetAspirationPlusModals(){
		isElementDisplayed(this.getAspirationPlusYearlyModal);
		isElementDisplayed(this.getAspirationPlusMonthlyModal);
		return this;
	}
	
	public ProductPage verifyYearlyCost(String text){
		verifyText(this.getAspirationPlusYearlyCost, text);
		return this;
	}
	
	public ProductPage verifyMonthlyCost(String text){
		verifyText(this.getAspirationPlusMonthlyCost, text);
		return this;
	}
	
	
	
}
