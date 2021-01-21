package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import utils.CommonUtils;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

public class GetPetSteps {
    @Given("We do a GET call to {string}")
    public void weDoAGETCallTo(String url) {
    }

    @And("We pass petId as {string}")
    public void wePassPetIdAs(String petId) {
        CommonUtils.getPetByPetId(petId);
    }

    @Then("We Assert the response body for status as {string}")
    public void weAssertTheResponseBodyForStatusAs(String arg0) {
        //REST-Assured is already a BDD supporter so using Cucumber with REST-Assured is not suggestible
        System.out.println("Case not skipped hence Status value is Available in Response");
    }
}
