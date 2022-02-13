package dafiti.stepdefinitions;

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;
import dafiti.driver.DriverOwn;
import dafiti.driver.PlayTheApp;
import dafiti.models.ShopperInformation;
import dafiti.task.CreateAccount;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DafitiStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("the {actor} open the app Dafiti")
    public void theUserOpenTheAppDafiti(Actor actor) {
        actor.whoCan(PlayTheApp.with(DriverOwn.init()));

    }
    @When("the user create a new account")
    public void theUserCreateANewAccount(List<ShopperInformation> shopperInformation) {
        theActorInTheSpotlight().attemptsTo(CreateAccount.whit(shopperInformation));

    }
    @When("the user search {string}")
    public void theUserSearch(String string) {

    }
    @When("the user add a shoe to shopping cart")
    public void theUserAddAShoeToShoppingCart() {

    }
    @Then("the user can see the item added is the same in the shopping cart")
    public void theUserCanSeeTheItemAddedIsTheSameInTheShoppingCart() {

    }




}
