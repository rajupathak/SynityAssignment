package com.synity.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.synity.driver.DriverManager;

public class TargetPage {

	// All the below Xpath are just for an exmaple and consedering there is no
	// Iframe in the page

	@FindBy(linkText = "collectLink")
	private WebElement collectLink;

	@FindBy(id = "Targets")
	private WebElement targetHeader;

	@FindBy(id = "Target Sources")
	private WebElement targetSources;

	@FindBy(id = "add")
	private WebElement addButton;

	@FindBy(id = "rowCount")
	private WebElement rowCount;

	@FindBy(id = "testIcon")
	private WebElement testConnectionICon;

	@FindBy(id = "targetdropdown")
	private List<WebElement> targetdropdown;

	@FindBy(id = "save")
	private WebElement saveButton;

	@FindBy(id = "cancel")
	private WebElement cancelButton;

	@FindBy(id = "successMessage")
	private WebElement successMessage;

	@FindBy(id = "connectionType")
	private WebElement connectionType;

	@FindBy(id = "schemaOwner")
	private WebElement schemaOwner;

	public TargetPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public WebElement getCollectLink() {
		return collectLink;
	}

	public WebElement getTargetHeader() {
		return targetHeader;
	}

	public WebElement getTargetSources() {
		return targetSources;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getRowCount() {
		return rowCount;
	}

	public WebElement getConnectionIcon() {
		return testConnectionICon;
	}

	public List<WebElement> getDropDownList() {
		return targetdropdown;
	}

	public WebElement getsaveButton() {
		return saveButton;
	}

	public WebElement getcancelButton() {
		return cancelButton;
	}

	public WebElement successMessage() {
		return successMessage;
	}

	public WebElement getconnectionType() {
		return connectionType;
	}

	public WebElement getSchemaOwner() {
		return schemaOwner;
	}

}
