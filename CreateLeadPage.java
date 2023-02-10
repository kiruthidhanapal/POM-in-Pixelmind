package com.leaftaps.UI.pages;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.leaftaps.UI.base.ProjectSpecificMethods;

import io.cucumber.messages.types.Duration;

public class CreateLeadPage extends ProjectSpecificMethods{


	public CreateLeadPage typeEmail(String email){
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}
	public CreateLeadPage typeFirstName(String firstName) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.id("fullName")).sendKeys(firstName);
		return this;

	}
	public CreateLeadPage typePhoneNumbare(String phonenumber) throws InterruptedException
	{	Thread.sleep(2000);
		driver.findElement(By.className("PhoneInputInput")).sendKeys(phonenumber);
		return this;

	}
	public CreateLeadPage typePersonalId(String personalid) throws InterruptedException
	{	Thread.sleep(2000);
		driver.findElement(By.id("personalId")).sendKeys(personalid);
		return this;

	}

	public CreateLeadPage typeGender() throws InterruptedException
	{	Thread.sleep(2000);
		List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\"gender\"]/option"));
		for(WebElement webElement : optionList) {
			if(webElement.getText().equals("Female")) {
				webElement.click();
			}}

		//((WebElement) driver.findElements(By.xpath("//*[@id=\"gender\"]/option"))).sendKeys(gender);
		return this;

	}

	public CreateLeadPage typeBranch() throws InterruptedException
	{	Thread.sleep(2000);
		List<WebElement> optionListt = driver.findElements(By.xpath("//*[@id=\"branch\"]/option"));
		for(WebElement webElementt : optionListt) {
			if(webElementt.getText().equals("HSR branch")) {
				webElementt.click();
			}}
		//((WebElement) driver.findElements(By.xpath("//*[@id=\"branch\"]/option"))).sendKeys(branch);
		return this;


	}
	public CreateLeadPage typeWorkspace() throws InterruptedException
	{	Thread.sleep(2000);
		List<WebElement> optionListt1 = driver.findElements(By.xpath("//*[@id=\"workplace\"]/option"));
		for(WebElement webElementt1 : optionListt1)
		{
			if(webElementt1.getText().equals("NA"))
			{
				webElementt1.click();
			}}
		return this;
		}

	public void clicksubmitButton() throws InterruptedException  {
		// TODO Auto-generated method stub
	/*	Thread.sleep(2000);
		WebElement element;
		element = driver.findElement(By.xpath("//*[@id=\"NotTop\"]/main/div/div[1]/form/div/div[3]/div/button[1]"));
		new WebDriverWait(driver, Duration(1)).until(ExpectedConditions.visibilityOf(element));
		Thread.sleep(4000);
		                driver.navigate().refresh();
		Thread.sleep(2000);*/
		WebElement element = driver.findElement(By.xpath("//button[text()='Submit']"));
		Thread.sleep(2000);
		//element.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);





	}
	/*	WebElement element;
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//button[text()='Submit']"));
		element.click();*/

	private java.time.Duration Duration(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	}

