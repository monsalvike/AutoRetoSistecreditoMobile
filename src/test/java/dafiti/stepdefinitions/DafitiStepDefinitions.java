package dafiti.stepdefinitions;

import dafiti.driver.DriverOwn;
import dafiti.driver.PlayTheApp;
import dafiti.models.ShopperInformation;
import dafiti.task.CreateAccount;
import dafiti.task.SearchItem;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static dafiti.task.AddItem.addItem;
import static dafiti.userinterfaces.Home.ITEMADDRESULT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class DafitiStepDefinitions {

    @Before
    public void setStage() {
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
    public void theUserSearch(String itemSearchInformation) {
        theActorInTheSpotlight().attemptsTo(SearchItem.with(itemSearchInformation));

    }

    @When("the user add item to shopping cart")
    public void theUserAddItemToShoppingCart() {
        theActorInTheSpotlight().attemptsTo(addItem());

    }

    @Then("the user can see the item added is the same in the shopping cart {string}")
    public void theUserCanSeeTheItemAddedIsTheSameInTheShoppingCart(String string) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(ITEMADDRESULT).hasText(string));


    }


}
