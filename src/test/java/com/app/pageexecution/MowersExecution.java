package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.ExcavatorsLocators;
import com.app.locators.MowersLocators;
import com.app.locators.TractorsLocators;

public class MowersExecution extends MowersLocators{
	public static void mowersLoader() {
		BaseClass.click(BaseClass.findByXpath(MowersLocators.mowersloader));
	}
	public static void mowersModels() throws InterruptedException {
		for (i = 1; i <= 7; i++) {
			if(i<=5) {
				BaseClass.getText(
						BaseClass.findByXpath("((//div[@class='items'])[12]/child::div[" + i + "]//following::div[1])[1]"));
				BaseClass.getText(BaseClass.findByXpath(
						"((//div[@class='items'])[12]/child::div[" + i + "]//following::div[1])[1]//following::p"));
			}
			else if(i==6) {
				
				BaseClass.click(BaseClass.findByXpath(MowersLocators.sidescroll4));
				Thread.sleep(2000);
				BaseClass.getText(
						BaseClass.findByXpath("((//div[@class='items'])[12]/child::div[" + i + "]//following::div[1])[1]"));
				BaseClass.getText(BaseClass.findByXpath(
						"((//div[@class='items'])[12]/child::div[" + i + "]//following::div[1])[1]//following::p"));
				}else if(i>6 && i<8) {
					BaseClass.getText(
							BaseClass.findByXpath("((//div[@class='items'])[12]/child::div[" + i + "]//following::div[1])[1]"));
					BaseClass.getText(BaseClass.findByXpath(
							"((//div[@class='items'])[12]/child::div[" + i + "]//following::div[1])[1]//following::p"));
				
				}
			}
//div[@class='items'])[12]/child::div[1]//following::div[1]"
	}

	
	public static void mowersFinal() throws InterruptedException {
		
		mowersModels();
		mowersModels();
		

	}
}
