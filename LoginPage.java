package com.leaftaps.UI.pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{


	public LoginPage typeUsername(String username)
	{	driver.findElement(By.id("userName")).sendKeys(username);
	return this;
	}
	public LoginPage typePassword(String password)
	{driver.findElement(By.id("password")).sendKeys(password);
	return this;
	}
	public WelcomPage clickLoginButton()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[6]/button")).click();
		return new WelcomPage();
	}

	}


