package org.stepdefinition1;

import java.awt.AWTException;

import org.baseclass.Baseclass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends Baseclass {
	@Given("user have to enter the Zando shopping site through chrome browser.")
	public void user_have_to_enter_the_Zando_shopping_site_through_chrome_browser()  {
		launchBrowser();
		loadUrl("https://www.zando.co.za/");
		maxBrowser();
		waits(20);
		//WebElement s = driver.findElement(By.xpath("//h2[text()='Signup to the Zando newsletter!']"));
		//s.click();
		//driver.switchTo().alert();
	
	

	}

	@When("User have to enter the product name.")
	public void user_have_to_enter_the_product_name()  {
		
		WebElement pname = driver.findElement(By.xpath("//input[@placeholder='Search products, brand and categories']"));
		pname.sendKeys("shirts");
		

	}

	@Then("User have to click the search button.")
	public void user_have_to_click_the_search_button(){

		driver.findElement(By.xpath("//button[text()='Search']")).click();
		toQuit();

	}

}
