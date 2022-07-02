package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.ExcavatorsLocators;
import com.app.locators.LoadersLocators;

public class ExcavatorsExecution extends ExcavatorsLocators {
	public static void excavatorsLoader() {
		BaseClass.click(BaseClass.findByXpath(ExcavatorsLocators.excavatorsloader));

	}

	public static void compactExcavatorsExe() {
		BaseClass.click(BaseClass.findByXpath(ExcavatorsLocators.compactexcavators));
	}

	public static void compactExcavatorsModels() throws InterruptedException {
		for (i = 1; i <= 10; i++) {
			if (i <= 5) {
				BaseClass.getText(
						BaseClass.findByXpath("(//div[@class='items'])[6]/child::div[" + i + "]//following::div[1]"));
				BaseClass.getText(BaseClass.findByXpath(
						"(//div[@class='items'])[6]/child::div[" + i + "]//following::div[1]//following::p"));
			} else if (i == 6) {
				BaseClass.click(BaseClass.findByXpath(ExcavatorsLocators.sidescroll3));
				Thread.sleep(2000);
				BaseClass.getText(
						BaseClass.findByXpath("(//div[@class='items'])[6]/child::div[" + i + "]//following::div[1]"));
				BaseClass.getText(BaseClass.findByXpath(
						"(//div[@class='items'])[6]/child::div[" + i + "]//following::div[1]//following::p"));
			} else if (i > 6 && i < 11) {
				BaseClass.getText(
						BaseClass.findByXpath("(//div[@class='items'])[6]/child::div[" + i + "]//following::div[1]"));
				BaseClass.getText(BaseClass.findByXpath(
						"(//div[@class='items'])[6]/child::div[" + i + "]//following::div[1]//following::p"));
			}
		}

	}

	public static void back6() {
		BaseClass.click(BaseClass.findByXpath(ExcavatorsLocators.back6));
	}

	public static void compactExcavatorsTypesFinal() throws InterruptedException {
		
		compactExcavatorsExe();
		compactExcavatorsModels();
		back6();

	}

	// Large excavators
	public static void largeExcavatorsExe() {
		BaseClass.click(BaseClass.findByXpath(ExcavatorsLocators.largeexcavators));
	}

	public static void largeExcavatorsModels() throws InterruptedException {
		for (i = 1; i <= 2; i++) {

			BaseClass.getText(
					BaseClass.findByXpath("(//div[@class='items'])[7]/child::div[" + i + "]//following::div[1]"));
			BaseClass.getText(BaseClass
					.findByXpath("(//div[@class='items'])[7]/child::div[" + i + "]//following::div[1]//following::p"));

		}

	}

	public static void back7() {
		BaseClass.click(BaseClass.findByXpath(ExcavatorsLocators.back7));
	}

	public static void excavatorsTypesFinal() throws InterruptedException {
		largeExcavatorsExe();
		largeExcavatorsModels();
		back7();

	}

}
