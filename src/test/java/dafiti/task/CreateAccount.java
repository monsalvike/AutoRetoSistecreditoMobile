package dafiti.task;


import dafiti.models.ShopperInformation;
import io.appium.java_client.android.nativekey.PressesKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import java.util.List;

import static dafiti.userinterfaces.Home.*;
import static org.openqa.selenium.Keys.ENTER;

public class CreateAccount implements Task {

    private ShopperInformation shopperInformation;

    public CreateAccount(List<ShopperInformation> shopperInformation) {
        this.shopperInformation = shopperInformation.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTNMYACCOUNT),Click.on(BTNREGISTER),Click.on(BTNCREATEACCOUNT));
        actor.attemptsTo(Enter.theValue(shopperInformation.getEmail()).into(TEXTFIELDEMAIL));
        actor.attemptsTo(Enter.theValue(shopperInformation.getPassword()).into(TEXTFLIEDPASSWORD));
        actor.attemptsTo(Enter.theValue(shopperInformation.getPassword()).into(TEXTFIELDCONFIRMPASSWORD));
        actor.attemptsTo(Click.on(SELECTDOCUMENTTYPE));
        actor.attemptsTo(Click.on(SELECTORDOCUMENTTYPE));
        actor.attemptsTo(Enter.theValue(shopperInformation.getDocumentNumber()).into(TEXTFIEDLDOCUMENTNUMBER));
        actor.attemptsTo(Enter.theValue(shopperInformation.getName()).into(TEXTFIELDNAME));
        actor.attemptsTo(Enter.theValue(shopperInformation.getLastName()).into(TEXTFIEDLLASTNAME));
        actor.attemptsTo(Enter.theValue(shopperInformation.getBirthday()).into(TEXTFIELBIRTHDAY));
        actor.attemptsTo(Click.on(SELECTGENDER));
        actor.attemptsTo(Click.on(SELECTORGENDER));
        actor.attemptsTo(Click.on(BTNREGISTERACOUNT));
    }

    public static CreateAccount whit (List<ShopperInformation> shopperInformation){
        return new CreateAccount(shopperInformation);
    }
}
