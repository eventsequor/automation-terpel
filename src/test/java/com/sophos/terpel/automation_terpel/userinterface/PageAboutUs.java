package com.sophos.terpel.automation_terpel.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageAboutUs extends PageObject {

	public static final Target SUMMARY_VISION = Target.the("Nuestra visión")
			.locatedBy("//*[@id=\"content\"]/section[2]/article/div[1]/div/table/tbody/tr/td[1]/ul/li");

}
