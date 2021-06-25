package Stepdefinition;

import com.synity.driver.Driver;
import com.synity.enums.ConfigProperties;
import com.synity.util.ReadProperty;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {
	protected BaseTest() {
	}
//Use of hooks
	@Before
	protected void setUp() {
		
		Driver.initDriver(ReadProperty.get(ConfigProperties.BROWSER));
	}

	@After
	protected void tearDown() {
		Driver.quitDriver();
	}

}
