package co.com.choucair.certification.googletraductor.tasks;

import co.com.choucair.certification.googletraductor.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.googletraductor.userinterfaces.GoogleTraductorPage.*;

public class TraducirPalabra implements Task {
    private List<DataModel> dataSet;

    public TraducirPalabra(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static TraducirPalabra con(List<DataModel> dataSet) {
        return Tasks.instrumented(TraducirPalabra.class,dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_LENGUAJE_ORIGEN));
        actor.attemptsTo(Enter.theValue(dataSet.get(0).getOrigen()).into(BUSCAR_LENGUAJE_ORIGEN).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(BOTON_LENGUAJE_DESTINO));
        actor.attemptsTo(Enter.theValue(dataSet.get(0).getDestino()).into(BUSCAR_LENGUAJE_DESTINO).thenHit(Keys.ENTER));
        actor.attemptsTo(Enter.theValue(dataSet.get(0).getEntrada()).into(AREA_DE_TRADUCCION));

    }
}
