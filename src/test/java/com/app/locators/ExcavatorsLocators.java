package com.app.locators;

import com.app.pageexecution.LoadersExecution;

public class ExcavatorsLocators extends LoadersExecution{
	public static String excavatorsloader= "(//a[text()='Excavators'])[1]"; 
	//Compact Excavators
	public static String compactexcavators = "//span[@class='dtm-pro-grp-txt-name' and text()='Compact Excavators']";
	public static String compactexcavatorstypes =("(//div[@class='items'])[6]/child::div["+ i +"]//following::div[1]");
	public static String compactexcavatorscap =("(//div[@class='items'])[6]/child::div["+i+"]//following::div[1]//following::p");
	public static String sidescroll3 ="(//i[@class='fa fa-angle-right fa-3 btn'])[6]";
	public static String back6="(//i[@class='fa fa-angle-left'])[6]";

	// Large Excavators
	public static String largeexcavators = "//span[@class='dtm-pro-grp-txt-name' and text()='Large Excavators']";
	public static String largeexcavatorstypes =("(//div[@class='items'])[7]/child::div["+ i +"]//following::div[1]");
	public static String largeexcavatorscap =("(//div[@class='items'])[7]/child::div["+i+"]//following::div[1]//following::p");
	public static String back7="(//i[@class='fa fa-angle-left'])[7]";
}
