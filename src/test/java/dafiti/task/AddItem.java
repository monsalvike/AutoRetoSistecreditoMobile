package dafiti.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static dafiti.userinterfaces.Home.BTNADDTOCARTGYSMAK;
import static dafiti.userinterfaces.Home.BTNGOCART;

public class AddItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTNADDTOCARTGYSMAK),
                WaitUntil.the(BTNGOCART, WebElementStateMatchers.isClickable()).forNoMoreThan(4).seconds(),
                Click.on(BTNGOCART));

    }

    public static AddItem addItem() {
        return new AddItem();
    }
}


