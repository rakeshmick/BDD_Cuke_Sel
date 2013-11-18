package com.bdd.SeleniumCucumber;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		format={"pretty","html:target/cucumber"},
		features={"C:\\MyHome\\EclipseWrkSpace\\SeleniumCucumber\\Resources"})
public class TestCukeRunner {

}
