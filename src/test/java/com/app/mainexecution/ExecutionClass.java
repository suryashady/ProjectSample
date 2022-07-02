package com.app.mainexecution;



import org.testng.annotations.Test;

import com.app.pageexecution.MowersExecution;

public class ExecutionClass extends MowersExecution {

	@Test(priority=0)
	public void startTheCar() {
		System.out.println("startTheCar");
	}
	@Test(priority=1)
	public void firstGear() {
		System.out.println("firstGear");
	}
	@Test(priority=2)
	public void secondGear() {
		System.out.println("secondGear");
	}
	@Test(priority=3)
	public void thirdGear() {
		System.out.println("thirdGear");
	}
	//public void test() throws InterruptedException {
//	loadDriver();
//	loadurl("https://www.bobcat.com/index");
//	cookiesexe();
//	loadersexe();
//	bobcattypesFinal();
//	skidSteerTypesFinal();
//	smallArticulatedLoadersFinal();
//	miniTrackLoadersFinal();
//	compactWheelLoadersFinal();
//	excavatorsLoader();
//	excavatorsTypesFinal();
//	excavatorsTypesFinal();
//	tractorsLoader();
//	Platform1000TypesFinal();
//	Platform2000TypesFinal();
//	Platform4000TypesFinal();
//	Platform5000TypesFinal();
//	mowersLoader();
//	mowersFinal();
//close();
//}
}
