package com.sophos.terpel.automation_terpel.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.terpel.com/")
public class HomePage extends PageObject{
	public static final Target QUIENES_SOMOS_LINK = Target.the("Quiénes somos").locatedBy("//a[contains(text(),'Quiénes somos')]");

}
