package org.pojoclass;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;

public class Test extends Baseclass {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://en-gb.facebook.com/");
		maxBrowser();
		pageTitle();
		pageUrl();

		// login functionality
		PojoClass p = new PojoClass();

		btnClick(p.getBtnforgotpass());
		fill(p.getTxtemailorno(), "rajesh@gmail.com");
		driver.navigate().refresh();
		fill(p.getTxtemailorno(),"greens@gmail.com");
		btnClick(p.getBtnsearch());
		toQuit();

	}

}
