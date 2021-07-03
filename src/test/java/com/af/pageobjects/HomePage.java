package com.af.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.af.helper.CommonFunctions;



public class HomePage extends CommonFunctions{
	
	private WebDriver driver;
	
	@FindBy(xpath="(//a[contains(text(),'Spend & Save')])[1]")
	public WebElement spendAndSave;
	
	public HomePage(WebDriver driver){
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductPage clickSpendAndSave(){
		clickElement(this.spendAndSave);
		return new ProductPage(driver);
	}
	
	
	
	
}
