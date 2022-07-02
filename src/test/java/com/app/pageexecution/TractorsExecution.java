package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.ExcavatorsLocators;
import com.app.locators.TractorsLocators;

public class TractorsExecution extends TractorsLocators {
	public static void tractorsLoader() {
		BaseClass.click(BaseClass.findByXpath(TractorsLocators.tractorsloader));
	}
	//1000 platform
	public static void platform1000TractorsExe() {
		BaseClass.click(BaseClass.findByXpath(TractorsLocators.platform1000tractors));
	}

	public static void platform1000TractorsModels() throws InterruptedException {
		for (i = 1; i <= 2; i++) {
			
				BaseClass.getText(
						BaseClass.findByXpath("(//div[@class='items'])[8]/child::div[" + i + "]//following::div[1]"));
				BaseClass.getText(BaseClass.findByXpath(
						"(//div[@class='items'])[8]/child::div[" + i + "]//following::div[1]//following::p"));
			
		}

	}

	public static void back8() {
		BaseClass.click(BaseClass.findByXpath(TractorsLocators.back8));
	}

	public static void Platform1000TypesFinal() throws InterruptedException {
		
		platform1000TractorsExe();
		platform1000TractorsModels();
		back8();

	}
	//2000 platform
		public static void platform2000TractorsExe() {
			BaseClass.click(BaseClass.findByXpath(TractorsLocators.platform2000tractors));
		}

		public static void platform2000TractorsModels() throws InterruptedException {
			for (i = 1; i <= 5; i++) {
				
					BaseClass.getText(
							BaseClass.findByXpath("(//div[@class='items'])[9]/child::div[" + i + "]//following::div[1]"));
					BaseClass.getText(BaseClass.findByXpath(
							"(//div[@class='items'])[9]/child::div[" + i + "]//following::div[1]//following::p"));
				
			}

		}

		public static void back9() {
			BaseClass.click(BaseClass.findByXpath(TractorsLocators.back9));
		}

		public static void Platform2000TypesFinal() throws InterruptedException {
			
			platform2000TractorsExe();
			platform2000TractorsModels();
			back9();

		}
		
		//4000 platform
				public static void platform4000TractorsExe() {
					BaseClass.click(BaseClass.findByXpath(TractorsLocators.platform4000tractors));
				}

				public static void platform4000TractorsModels() throws InterruptedException {
					for (i = 1; i <= 4; i++) {
						
							BaseClass.getText(
									BaseClass.findByXpath("(//div[@class='items'])[10]/child::div[" + i + "]//following::div[1]"));
							BaseClass.getText(BaseClass.findByXpath(
									"(//div[@class='items'])[10]/child::div[" + i + "]//following::div[1]//following::p"));
						
					}

				}

				public static void back10() {
					BaseClass.click(BaseClass.findByXpath(TractorsLocators.back10));
				}

				public static void Platform4000TypesFinal() throws InterruptedException {
					
					platform4000TractorsExe();
					platform4000TractorsModels();
					back10();

				}
				
				//5000 platform
				public static void platform5000TractorsExe() {
					BaseClass.click(BaseClass.findByXpath(TractorsLocators.platform5000tractors));
				}

				public static void platform5000TractorsModels() throws InterruptedException {
					for (i = 1; i <= 4; i++) {
						
							BaseClass.getText(
									BaseClass.findByXpath("(//div[@class='items'])[11]/child::div[" + i + "]//following::div[1]"));
							BaseClass.getText(BaseClass.findByXpath(
									"(//div[@class='items'])[11]/child::div[" + i + "]//following::div[1]//following::p"));
						
					}

				}

				public static void back11() {
					BaseClass.click(BaseClass.findByXpath(TractorsLocators.back11));
				}

				public static void Platform5000TypesFinal() throws InterruptedException {
					
					platform5000TractorsExe();
					platform5000TractorsModels();
					back11();

				}
}
