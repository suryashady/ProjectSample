package com.app.locators;

import com.app.pageexecution.TractorsExecution;

public class MowersLocators extends TractorsExecution {
	public static String mowersloader = "(//a[text()='Mowers'])[1]";
	
	public static String mowerstypes =("(//div[@class='items'])[12]/child::div["+ i +"]//following::div[1]");
	public static String mowerscap =("(//div[@class='items'])[12]/child::div["+i+"]//following::div[1]//following::p");
	public static String sidescroll4 ="(//i[@class='fa fa-angle-right fa-3 btn'])[12]";
}
