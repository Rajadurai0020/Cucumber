package org.pojoclass;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends Baseclass{
	//non parameterized constructor
	
		public LoginPojoClass() {
	      PageFactory.initElements(driver, this);
		}
		
		//private webElement
		
		@FindBy(id="email.")
		private WebElement Txtemail;
		
		@FindBy(id="pass")
		private WebElement txtpass;
		
		@FindBy(name="login")
		private WebElement btnlogin;

		public WebElement getTxtemail() {
			return Txtemail;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}

		public WebElement getBtnlogin() {
			return btnlogin;
		}
		
		}
		





