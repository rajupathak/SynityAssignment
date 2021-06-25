package Stepdefinition;

import java.util.List;
import java.util.Objects;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;

import com.synity.driver.DriverManager;
import com.synity.pages.TargetPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewtargetTest extends BaseTest {
	TargetPage tartGetObject = new TargetPage();
	public int rowCount = 0;
	public List<WebElement> tagetList;

	@Given("User is on home page")
	public void user_is_on_home_page() {

		// Validate Home Page Title

		Assertions.assertThat(DriverManager.getDriver().getTitle()).isNotNull();

	}

	@Given("User should be displayed with collect link on left hand navigation bar")
	public void user_should_be_displayed_with_collect_link_on_left_hand_navigation_bar() {

		// Validate collect link

		Assertions.assertThat(tartGetObject.getCollectLink().isDisplayed());

	}

	@When("User click on collect link")
	public void user_click_on_collect_link() {

		// Click on Collect link

		tartGetObject.getCollectLink().click();

	}

	@Then("User should be displayed header frame with Targets details")
	public void user_should_be_displayed_header_frame_with_Targets_details() {

		// validate header frame with Targets details

		Assertions.assertThat(tartGetObject.getTargetHeader().getText().equals("Targets"));

	}

	@Then("The corresponding Target Sources in the detail frame of the page should be displayed")
	public void the_corresponding_Target_Sources_in_the_detail_frame_of_the_page_should_be_displayed() {

		// validate Details frame with TargetsSrouces details
		Assertions.assertThat(tartGetObject.getTargetSources().getText().equals("TargetSources"));
	}

	@Then("User should be displayed with add button in the Targets details in header frame")
	public void user_should_be_displayed_with_add_button_in_the_Targets_details_in_header_frame() {
		// validate add button presence
		Assertions.assertThat(tartGetObject.getAddButton().isDisplayed());
	}

	@Then("User should be displayed with rows with value")
	public void user_should_be_displayed_with_rows_with_value() {
		// Validate Initial row count
		rowCount = Integer.parseInt(tartGetObject.getRowCount().getText());
		Assertions.assertThat(rowCount == 1);
	}

	@Then("User should be displayed with Test Connection icon and it should be enabled")
	public void user_should_be_displayed_with_Test_Connection_icon_and_it_should_be_enabled() {

		// verify test connection Icon
		Assertions.assertThat(tartGetObject.getConnectionIcon().isEnabled());

	}

	@When("User cliks on Test Connection icon")
	public void user_cliks_on_Test_Connection_icon() {

		tartGetObject.getConnectionIcon().click();
	}

	@Then("user should be displayed with success message")
	public void user_should_be_displayed_with_success_message() {

		// validate database Connectivity
		Assertions.assertThat(
				tartGetObject.successMessage().getText().equalsIgnoreCase("Database is connected successfully"));
	}

	@Then("User clicks on add button to add the target")
	public void user_clicks_on_add_button_to_add_the_target() {
		tartGetObject.getAddButton().click();

	}

	@Then("User should be displayed with targetdropdown list")
	public void user_should_be_displayed_with_targetdropdown_list() {
		// Validate the target dropdown list
		tagetList = tartGetObject.getDropDownList();
		Assertions.assertThat(tagetList.size() != 0);
	}

	@Then("Verify Connection Type and Schema Owner field should not be editable")
	public void verify_Connection_Type_and_Schema_Owner_field_should_not_be_aditable() {

		Assertions.assertThat(
				!tartGetObject.getConnectionIcon().isEnabled() && !tartGetObject.getSchemaOwner().isEnabled());

	}

	@Then("User should be able to select QETestDB1 from the drop down list")
	public void user_should_be_able_to_select_QETestDB1_from_the_drop_down_list(String tagrgetValue) {

		// Select QETestDB1 from the targetdropDown

		for (int i = 0; i < tagetList.size(); i++) {
			String dropDownvalue = tagetList.get(i).getText();
			if (Objects.nonNull(dropDownvalue) && dropDownvalue.equalsIgnoreCase(tagrgetValue)) {
				tagetList.get(i).click();
				break;
			}
		}

	}

	@Then("User should be displayed with save and cancel button")
	public void user_should_be_displayed_with_save_and_cancel_button() {

		Assertions.assertThat(
				tartGetObject.getsaveButton().isDisplayed() && tartGetObject.getcancelButton().isDisplayed());

	}

	@When("User cliks on save button")
	public void user_cliks_on_save_button() {
		tartGetObject.getsaveButton().click();

	}

	@Then("User should be able to see the newly added target details in header frame")
	public void user_should_be_able_to_see_the_newly_added_target_details_in_header_frame() {
//here we can write the logic to get the tagrget colmun value and can validate if it contains newly added tagrgetValue
	}

	@Then("The value of rows should be updated")
	public void the_value_of_rows_should_be_updated() {
		rowCount = Integer.parseInt(tartGetObject.getRowCount().getText());
		Assertions.assertThat(rowCount == 2);
	}

}