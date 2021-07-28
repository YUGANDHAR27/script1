package com.automationAspireportal.testscript;

import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.testsuite.TestsuiteBase;

public class TC01_EmployeePage extends TestsuiteBase {

//  public TC01_EmployeePage(WebDriver driver) {
//		this.driver = driver;
//	}
	@Test
	public void employeeModule() throws InterruptedException {

		EmployeePageHelper page = new EmployeePageHelper(driver);
		page.employeeHelper();
		Thread.sleep(2000);
		// String Actualresult = driver.getTitle();
		// assertEquals(Actualresult, Expeectedresult);
//		Logout out = new Logout();
//		out.logoutEmployeemodule();

	}

}
