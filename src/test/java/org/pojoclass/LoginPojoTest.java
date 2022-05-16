package org.pojoclass;

import org.baseclass.Baseclass;

public class LoginPojoTest extends Baseclass {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://en-gb.facebook.com/");
		maxBrowser();
		LoginPojoClass p=new LoginPojoClass();
		fill(p.getTxtemail(), "python123@gmail.com");
		fill(p.getTxtpass(), "python123");
		btnClick(p.getBtnlogin());
		toQuit();
	}

}
