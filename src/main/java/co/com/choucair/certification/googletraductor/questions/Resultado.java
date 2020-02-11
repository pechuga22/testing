package co.com.choucair.certification.googletraductor.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.googletraductor.userinterfaces.GoogleTraductorPage.AREA_TRADUCIDA;

public class Resultado implements Question<Boolean> {
    private String palabra;

    private Resultado(String palabra) {
        this.palabra = palabra;
    }
    public  static Resultado esLa(String palabra){
        return new Resultado(palabra);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String traduccion = Text.of(AREA_TRADUCIDA).viewedBy(actor).asString();
        return palabra.equals(traduccion);
    }
}
