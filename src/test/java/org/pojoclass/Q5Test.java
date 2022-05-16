package org.pojoclass;

import org.baseclass.Baseclass;

public class Q5Test extends Baseclass {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
		pageTitle();
		pageUrl();
		maxBrowser();
		
		Q5 q=new Q5();
		
		fill(q.getTxtuser(), "rajesh@gmail.com");
		fill(q.getTxtpass(), "rajesh");
		btnClick(q.getBtnlogin());
		toQuit();
		
		
	}

}
