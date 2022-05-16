package org.pojoclass;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Q5 extends Baseclass{
	public Q5() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		@FindBy(id="username"),
		@FindBy(name="user")
		
	})
	private WebElement txtuser;
	@CacheLookup
	@FindBy(id="password")
	private WebElement txtpass;
	@CacheLookup
	@FindBys({
		@FindBy(xpath="//input[@id='login']"),
		@FindBy(xpath="//input[@name='login']")
	})
	private WebElement btnlogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	

}
