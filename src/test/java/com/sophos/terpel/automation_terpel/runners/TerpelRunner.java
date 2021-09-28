package com.sophos.terpel.automation_terpel.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.sophos.terpel.automation_terpel.stepsdefinitions", monochrome = true, plugin = {
		"pretty" })
public class TerpelRunner {

}
