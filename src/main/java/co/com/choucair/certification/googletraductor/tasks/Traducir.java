package co.com.choucair.certification.googletraductor.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.googletraductor.userinterfaces.GoogleTraductorPage.*;

public class Traducir implements Task {
    private String laPalabra;

    public Traducir(String laPalabra) {
        this.laPalabra = laPalabra;
    }

    public static Traducir deInglesAEspanol(String laPalabra) {
        return Tasks.instrumented(Traducir.class, laPalabra);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BOTON_LENGUAJE_ORIGEN));
        actor.attemptsTo(Click.on(OPCION_INGLES));
        actor.attemptsTo(Click.on(BOTON_LENGUAJE_DESTINO));
        actor.attemptsTo(Click.on(OPCION_ESPANOL));
        actor.attemptsTo(Enter.theValue(laPalabra).into(AREA_DE_TRADUCCION));

    }
}
