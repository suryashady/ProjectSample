package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.LoadersLocators;

public class LoadersExecution extends LoadersLocators{
	public static void cookiesexe() {
		BaseClass.click(BaseClass.findByXpath(LoadersLocators.cookies));
	}
public static void loadersexe() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.loaders));
}
public static void compacttrackloadersexe() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.compacttrackloaders));
}
public static void bobcatt450exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt450));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt450cap));
}
public static void bobcatt550exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt550));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt550cap));
}
public static void bobcatt595exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt595));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt595cap));
}
public static void bobcatt62exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt62));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt62cap));
}
public static void bobcatt64exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt64));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt64cap));
}
public static void sideScroll1exe() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.sidescroll1));
}
public static void bobcatt66exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt66));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt66cap));
}
public static void bobcatt76exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt76));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt76cap));
}
public static void bobcatt740exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt740));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt740cap));
}
public static void bobcatt770exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt770));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt770cap));
}
public static void bobcatt870exe() {
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt870));
	BaseClass.getText(BaseClass.findByXpath(LoadersLocators.bobcatt870cap));
}
public static void back1() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.back1));
}
public static void bobcattypesFinal() throws InterruptedException {
	compacttrackloadersexe();
	bobcatt450exe();
	bobcatt550exe();
	bobcatt595exe();
	bobcatt62exe();
	bobcatt64exe();
	Thread.sleep(2000);
	sideScroll1exe();
	Thread.sleep(2000);
	bobcatt66exe();
	bobcatt76exe();
	bobcatt740exe();
	bobcatt770exe();
	bobcatt870exe();
	Thread.sleep(2000);
	back1();
}

public static void skidSteerTypesExe() {
		BaseClass.click(BaseClass.findByXpath(LoadersLocators.skidsteerloaders));
	}
public static void skidSteerModels() throws InterruptedException {
	for (i=1; i<=11; i++) {
		if(i<=5) {		
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+ i +"]//following::div[1]"));
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+i+"]//following::div[1]//following::p"));
		}else if(i==6) {
			BaseClass.click(BaseClass.findByXpath(LoadersLocators.sidescroll2));
			Thread.sleep(2000);
			BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+ i +"]//following::div[1]"));
			BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+i+"]//following::div[1]//following::p"));
		}else if(i>6&&i<11) {
			BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+ i +"]//following::div[1]"));
			BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+i+"]//following::div[1]//following::p"));
		}else if(i==11) {
			BaseClass.click(BaseClass.findByXpath(LoadersLocators.sidescroll2));
			Thread.sleep(2000);
			BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+ i +"]//following::div[1]"));
			BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[2]/child::div["+i+"]//following::div[1]//following::p"));
		}
}
	
}
public static void back2() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.back2));
}
public static void skidSteerTypesFinal() throws InterruptedException {
	skidSteerTypesExe();
	skidSteerModels();
	back2();
	
}
//Small Articulated Loaders
public static void smallArticulatedLoadersExe() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.smallarticulatedloaders));
}
public static void smallArticulatedLoadersModels() throws InterruptedException {
	for (i=1; i<=2; i++) {
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[3]/child::div["+ i +"]//following::div[1]"));
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[3]/child::div["+i+"]//following::div[1]//following::p"));
	}	
}
public static void back3() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.back3));
}
public static void smallArticulatedLoadersFinal() throws InterruptedException {
	smallArticulatedLoadersExe();
	smallArticulatedLoadersModels();
	back3();
	
}
//Mini Track Loaders
public static void miniTrackLoadersExe() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.minitrackloaders));
}
public static void miniTrackLoadersModels() throws InterruptedException {
	for (i=1; i<=2; i++) {
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[4]/child::div["+ i +"]//following::div[1]"));
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[4]/child::div["+i+"]//following::div[1]//following::p"));
	}	
}
public static void back4() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.back4));
}
public static void miniTrackLoadersFinal() throws InterruptedException {
	miniTrackLoadersExe();
	miniTrackLoadersModels();
	back4();
	
}
//Compact Wheel Loaders
public static void compactWheelLoadersExe() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.compactwheelloaders));
}
public static void compactWheelLoadersModels() throws InterruptedException {
	for (i=1; i<=2; i++) {
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[5]/child::div["+ i +"]//following::div[1]"));
		BaseClass.getText(BaseClass.findByXpath("(//div[@class='items'])[5]/child::div["+i+"]//following::div[1]//following::p"));
	}	
}
public static void back5() {
	BaseClass.click(BaseClass.findByXpath(LoadersLocators.back5));
}
public static void compactWheelLoadersFinal() throws InterruptedException {
	compactWheelLoadersExe();
	compactWheelLoadersModels();
	back5();
	
}

}

