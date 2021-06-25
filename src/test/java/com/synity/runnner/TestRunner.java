package com.synity.runnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src\\test\\resources\\Features\\", glue = {
		"\\src\\test\\java\\Stepdefinition\\AddNewtargetTest" }, monochrome = true, plugin = { "pretty",
				"html:traget/HTMLReports" }, tags = { "@SanityTest" })
public class TestRunner {

}
