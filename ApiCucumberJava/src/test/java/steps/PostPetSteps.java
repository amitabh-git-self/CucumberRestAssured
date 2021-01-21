package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CommonUtils;

public class PostPetSteps {

    @Given("We do a POST call to {string}")
    public void we_do_a_POST_call_to(String string) {

    }

    @When("We do a Post with petId as {string} and petName as {string}")
    public void we_do_a_Post_with_petId_as_and_petName_as(String petId, String petName) {
        CommonUtils.postPet(petId, petName);
    }

    @Then("We Assert the new pet added")
    public void we_Assert_the_new_pet_added() {

    }


}
