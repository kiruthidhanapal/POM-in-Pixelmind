package com.leaftaps.UI.pages;

import org.openqa.selenium.By;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class WelcomPage extends ProjectSpecificMethods{
	public HomePage clickMembers()

		{

			driver.findElement(By.xpath("//p[text()='Members']"));
			return new HomePage();
		}

	}


