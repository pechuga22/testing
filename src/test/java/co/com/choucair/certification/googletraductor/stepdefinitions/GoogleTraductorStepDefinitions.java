package co.com.choucair.certification.googletraductor.stepdefinitions;

import co.com.choucair.certification.googletraductor.models.DataModel;
import co.com.choucair.certification.googletraductor.questions.Resultado;
import co.com.choucair.certification.googletraductor.questions.ResultadoPalabra;
import co.com.choucair.certification.googletraductor.tasks.Abrir;
import co.com.choucair.certification.googletraductor.tasks.Traducir;
import co.com.choucair.certification.googletraductor.tasks.TraducirPalabra;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class GoogleTraductorStepDefinitions {
    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que brandon quiere usar el Traductor de Google$")
    public void queBrandonQuiereUsarElTraductorDeGoogle()  {
        OnStage.theActorCalled("brandon").wasAbleTo(Abrir.laPaginaDeGoogleTranslate());

    }


    @Cuando("^el traduce la palabra (.*) de Ingles a Español$")
    public void elTraduceLaPalabraTableDeInglesAEspañol(String laPalabra) {
        OnStage.theActorInTheSpotlight().attemptsTo(Traducir.deInglesAEspanol(laPalabra));
    }

    @Entonces("^el deberia ver la palabra(.*) en la pantalla$")
    public void elDeberiaVerLaPalabraMesaEnLaPantalla(String palabra)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Resultado.esLa(palabra)));
    }

    @Dado("^que Juana quiere usar el Traductor de Google$")
    public void queJuanaQuiereUsarElTraductorDeGoogle() {
        OnStage.theActorCalled("Juana").wasAbleTo(Abrir.laPaginaDeGoogleTranslate());
    }


    @Cuando("^el traduce una palabra de un idioma a otro$")
    public void elTraduceUnaPalabraDeUnIdiomaAOtro(List<DataModel>dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(TraducirPalabra.con(dataSet));

    }

    @Entonces("^el verifica que la palabra traducida del idioma origen a idioma destino$")
    public void elVerificaQueLaPalabraTraducidaDelIdiomaOrigenAIdiomaDestino(List<DataModel>dataSet)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultadoPalabra.esLa(dataSet)));
    }
}
