package co.com.choucair.certification.googletraductor.tasks;

import co.com.choucair.certification.googletraductor.userinterfaces.GoogleTranslateHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private GoogleTranslateHomePage googleTranslateHomePage;
    public static Abrir laPaginaDeGoogleTranslate() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googleTranslateHomePage));
    }
}
