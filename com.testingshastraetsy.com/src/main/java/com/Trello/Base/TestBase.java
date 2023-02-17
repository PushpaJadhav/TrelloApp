package com.Trello.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Trello.Keywords.KeyWord;


public class TestBase {
	@BeforeMethod
	public void launcUrlSelf() {
		KeyWord.openBrowser("chrome");

	}

//	@AfterMethod
//	public void teerdownSelf() {
//		KeyWord.driver.quit();
//	}

}
