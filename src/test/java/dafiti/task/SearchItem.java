package dafiti.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static dafiti.userinterfaces.Home.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SearchItem implements Task {

    private String itemSearch;

    public SearchItem(String itemSearch) {
        this.itemSearch = itemSearch;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(the(BTNGOTHEAPP), isVisible()).andIfSo(Click.on(BTNGOTHEAPP)),
                Click.on(SEARCHINPUT),
                Click.on(CLICKSEARCH),
                Click.on(SEARCHINPUT),
                Enter.theValue(itemSearch).into(SEARCHINPUT), Click.on(SEEALL));
    }

    public static SearchItem with(String itemSearch) {
        return new SearchItem(itemSearch);
    }
}
