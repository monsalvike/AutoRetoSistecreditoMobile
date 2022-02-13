package dafiti.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static dafiti.userinterfaces.Home.*;

public class SearchItem implements Task {

    private String itemSearch;

    public SearchItem(String itemSearch) {
        this.itemSearch = itemSearch;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(BTNGOTHEAPP));
        actor.attemptsTo(Click.on(CLICKSEARCH));
        actor.attemptsTo(Click.on(SEARCHINPUT));
        actor.attemptsTo(Enter.theValue(itemSearch).into(SEARCHINPUT),Click.on(SEEALL));
    }

    public static SearchItem with(String itemSearch){
        return new SearchItem(itemSearch);
    }
}
