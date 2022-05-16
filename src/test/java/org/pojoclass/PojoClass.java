package org.pojoclass;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends Baseclass {
	//non parameterized constructor
	
	public PojoClass() {
      PageFactory.initElements(driver, this);
	}
	
	//private webElement
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement btnforgotpass;
	
	@FindBy(id="identify_email")
	private WebElement txtemailorno;
	
	@FindBy(name="did_submit")
	private WebElement btnsearch;
	
	//getters to access those WebElement outside

	public WebElement getBtnforgotpass() {
		return btnforgotpass;
	}

	public WebElement getTxtemailorno() {
		return txtemailorno;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}
	



}
