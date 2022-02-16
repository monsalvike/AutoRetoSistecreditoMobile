package dafiti.task;


import dafiti.models.ShopperInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

import static dafiti.userinterfaces.Home.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CreateAccount implements Task {

    private ShopperInformation shopperInformation;

    public CreateAccount(List<ShopperInformation> shopperInformation) {
        this.shopperInformation = shopperInformation.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(the(BTNGOTHEAPP), isVisible()).andIfSo(Click.on(BTNGOTHEAPP)),
                Check.whether(the(BTNINTRO), isVisible()).andIfSo(Click.on(BTNINTRO)),
                Click.on(BTNMYACCOUNT), Click.on(BTNREGISTER), Click.on(BTNCREATEACCOUNT),
                Enter.theValue(shopperInformation.getEmail()).into(TEXTFIELDEMAIL),
                Enter.theValue(shopperInformation.getPassword()).into(TEXTFLIEDPASSWORD),
                Enter.theValue(shopperInformation.getPassword()).into(TEXTFIELDCONFIRMPASSWORD),
                Click.on(SELECTDOCUMENTTYPE),
                Click.on(SELECTORDOCUMENTTYPE),
                Enter.theValue(shopperInformation.getDocumentNumber()).into(TEXTFIEDLDOCUMENTNUMBER),
                Enter.theValue(shopperInformation.getName()).into(TEXTFIELDNAME),
                Enter.theValue(shopperInformation.getLastName()).into(TEXTFIEDLLASTNAME),
                Enter.theValue(shopperInformation.getBirthday()).into(TEXTFIELBIRTHDAY),
                Click.on(SELECTGENDER),
                Click.on(SELECTORGENDER),
                Click.on(BTNREGISTERACOUNT));
    }

    public static CreateAccount with(List<ShopperInformation> shopperInformation) {
        return new CreateAccount(shopperInformation);
    }
}
