package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SearchCoursePage;

public class search implements Task {
    private String course;

    public search(String course) {
        this.course = course;
    }

    public static search the(String course) {
        return Tasks.instrumented(search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Click.on(SearchCoursePage.NAME_COURSE),
                Click.on(SearchCoursePage.CONTINUE)

        );

    }
}
