package dafiti.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static dafiti.userinterfaces.Home.BTNADDTOCARTGYSMAK;
import static dafiti.userinterfaces.Home.BTNGOCART;

public class AddItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTNADDTOCARTGYSMAK));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(BTNGOCART));

    }

    public static AddItem addItem (){
        return new AddItem();
    }
}


