package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;


public class TC03_Action_approve extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	//	public TC03_Action_approve(WebDriver driver) {
	//		this.driver = driver;
	//	}
	@Test
	public void manageractionapprove() throws InterruptedException
	{
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		Thread.sleep(20000);
		driver.findElement(By.xpath(read.clickonApproveaction())).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

	}
}
