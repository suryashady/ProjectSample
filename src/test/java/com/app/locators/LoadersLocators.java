package com.app.locators;

import com.app.base.BaseClass;
public class LoadersLocators extends BaseClass {
	
	public static String cookies = "//a[@class='btn accept']";
public static String loaders= "(//a[text()='Loaders'])[1]"; //text xpath
//Compact Track Loaders
public static String compacttrackloaders = "//span[@class='dtm-pro-grp-txt-name' and text()='Compact Track Loaders']";
public static String bobcatt450 ="//div[text()='Bobcat T450 Compact Track Loader']";
public static String bobcatt450cap ="//div[text()='Bobcat T450 Compact Track Loader']//following::p";
public static String bobcatt550 ="//div[text()='Bobcat T550 Compact Track Loader']";
public static String bobcatt550cap ="//div[text()='Bobcat T550 Compact Track Loader']//following::p";
public static String bobcatt595 ="//div[text()='Bobcat T595 Compact Track Loader']";
public static String bobcatt595cap ="//div[text()='Bobcat T595 Compact Track Loader']//following::p";
public static String bobcatt62 ="//div[text()='Bobcat T62 Compact Track Loader']";
public static String bobcatt62cap ="//div[text()='Bobcat T62 Compact Track Loader']//following::p";
public static String bobcatt64 ="//div[text()='Bobcat T64 Compact Track Loader']";
public static String bobcatt64cap ="//div[text()='Bobcat T64 Compact Track Loader']//following::p";
public static String sidescroll1 = "(//i[@class='fa fa-angle-right fa-3 btn'])[1]" ;
public static String bobcatt66 ="//div[text()='Bobcat T66 Compact Track Loader']";
public static String bobcatt66cap ="//div[text()='Bobcat T66 Compact Track Loader']//following::p";
public static String bobcatt76 ="//div[text()='Bobcat T76 Compact Track Loader']";
public static String bobcatt76cap ="//div[text()='Bobcat T76 Compact Track Loader']//following::p";
public static String bobcatt740 ="//div[text()='Bobcat T740 Compact Track Loader']";
public static String bobcatt740cap ="//div[text()='Bobcat T740 Compact Track Loader']//following::p";
public static String bobcatt770 ="//div[text()='Bobcat T770 Compact Track Loader ']";
public static String bobcatt770cap ="//div[text()='Bobcat T770 Compact Track Loader ']//following::p";
public static String bobcatt870 ="//div[text()='Bobcat T870 Compact Track Loader ']";
public static String bobcatt870cap ="//div[text()='Bobcat T870 Compact Track Loader ']//following::p";

public static String back1="(//i[@class='fa fa-angle-left'])[1]";

//Skid Steer Loaders
public static String skidsteerloaders = "//span[@class='dtm-pro-grp-txt-name' and text()='Skid-Steer Loaders']";


public static int i; 

public static String skidsteertypes =("(//div[@class='items'])[2]/child::div["+ i +"]//following::div[1]");
public static String skidsteertypescap =("(//div[@class='items'])[2]/child::div["+i+"]//following::div[1]//following::p");
public static String sidescroll2 ="(//i[@class='fa fa-angle-right fa-3 btn'])[2]";
public static String back2="(//i[@class='fa fa-angle-left'])[2]";


//Small Articulated Loaders
public static String smallarticulatedloaders = "//span[@class='dtm-pro-grp-txt-name' and text()='Small Articulated Loaders']";
public static String smallarticulatedtypes =("(//div[@class='items'])[3]/child::div["+ i +"]//following::div[1]");
public static String smallarticulatedcap =("(//div[@class='items'])[3]/child::div["+i+"]//following::div[1]//following::p");
public static String back3="(//i[@class='fa fa-angle-left'])[3]";

//Mini Track Loaders
public static String minitrackloaders = "//span[@class='dtm-pro-grp-txt-name' and text()='Mini Track Loaders']";
public static String minitracktypes =("(//div[@class='items'])[4]/child::div["+ i +"]//following::div[1]");
public static String minitrackcap =("(//div[@class='items'])[4]/child::div["+i+"]//following::div[1]//following::p");
public static String back4="(//i[@class='fa fa-angle-left'])[4]";

//Compact Wheel Loaders
public static String compactwheelloaders = "//span[@class='dtm-pro-grp-txt-name' and text()='Compact Wheel Loaders']";
public static String compactwheeltypes =("(//div[@class='items'])[5]/child::div["+ i +"]//following::div[1]");
public static String compactwheelcap =("(//div[@class='items'])[5]/child::div["+i+"]//following::div[1]//following::p");
public static String back5="(//i[@class='fa fa-angle-left'])[5]";
}
