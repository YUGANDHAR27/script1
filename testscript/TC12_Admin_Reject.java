package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC12_Admin_Reject extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
    @Test
	public void adminreject() throws InterruptedException {
		//TC01_EmployeePage employee=new TC01_EmployeePage();
		//TC04_Manager_approve approve = new TC04_Manager_approve();
		//approve.managerapprove();
		//Logout out=new Logout(driver);
		//out.logoutEmployeemodule();
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(
				By.xpath(read.rejectSelectproject())));
		select.selectByValue("56");
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.findElement(By.xpath(read.clickonreject())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.popupreject())).click();
		driver.findElement(By.xpath(read.entercomment())).sendKeys("do well");
		driver.findElement(By.xpath(read.popupreject())).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

	

	}

}
