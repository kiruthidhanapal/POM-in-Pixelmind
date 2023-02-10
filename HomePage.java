package com.leaftaps.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
public CreateLeadPage clickAddnewMember() throws InterruptedException

{
	//System.out.println(overr.getText());
	Thread.sleep(2000);

	WebElement overr = driver.findElement(By.xpath("//p[text()='Members']"));

Actions action1 = new Actions(driver);
//Thread.sleep(3000);
action1.moveToElement(overr).perform();
//hread.sleep(3000);
	Thread.sleep(2000);
	driver.findElement(By.linkText("Add New Member")).click();

	return new CreateLeadPage();
}}
