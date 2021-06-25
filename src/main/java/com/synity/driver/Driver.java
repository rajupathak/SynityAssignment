package com.synity.driver;

import java.util.Objects;

import com.synity.enums.ConfigProperties;
import com.synity.factory.DriverFactory;
import com.synity.util.ReadProperty;

public final class Driver {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private Driver() {
	}

	public static void initDriver(String browser) {
		if (Objects.isNull(DriverManager.getDriver())) {

			DriverManager.setDriver(DriverFactory.getDriver(browser));	
			DriverManager.getDriver().get(ReadProperty.get(ConfigProperties.URL));
			DriverManager.getDriver().manage().window().maximize();
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
