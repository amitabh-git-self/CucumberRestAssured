package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.CommonUtils;

public class PutPetSteps {

    @Given("We do a Put call to {string}")
    public void we_do_a_Put_call_to(String url) {
    }

    @Given("We pass status as {string}")
    public void we_pass_status_as(String newStatus) {
        CommonUtils.putPet(newStatus);
    }

    @Then("We Assert the update of the status attribute")
    public void we_Assert_the_update_of_the_status_attribute() {
    }
}
