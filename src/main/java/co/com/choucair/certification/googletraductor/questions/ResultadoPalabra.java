package co.com.choucair.certification.googletraductor.questions;

import co.com.choucair.certification.googletraductor.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.googletraductor.userinterfaces.GoogleTraductorPage.AREA_TRADUCIDA;

public class ResultadoPalabra implements Question<Boolean> {
    private List<DataModel> dataSet;

    public ResultadoPalabra(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public  static ResultadoPalabra esLa(List<DataModel> dataSet){
        return new ResultadoPalabra(dataSet);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String traduccion = Text.of(AREA_TRADUCIDA).viewedBy(actor).asString();
        return dataSet.get(0).getSalida().equals(traduccion);
    }
}
