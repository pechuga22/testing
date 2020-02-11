package co.com.choucair.certification.googletraductor.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTraductorPage extends PageObject {

    public static final Target BOTON_LENGUAJE_ORIGEN = Target.the("Boton para buscar el lenguaje de origen").located(By.cssSelector("div.sl-more.tlid-open-source-language-list"));
    public static final Target BOTON_LENGUAJE_DESTINO = Target.the("Boton para buscar el lenguaje de destino").located(By.cssSelector("div.tl-more.tlid-open-target-language-list"));
    public static final Target OPCION_ESPANOL = Target.the("lenguaje a seleccionar español").located(By.xpath("(//div[@class='language_list_item language_list_item_language_name'][contains(text(),'español')])[4]"));
    public static final Target OPCION_INGLES = Target.the("lenguaje a seleccionar ingles").located(By.xpath("(//div[@class='language_list_item language_list_item_language_name'][contains(text(),'inglés')])[1]"));
    public static final Target AREA_DE_TRADUCCION = Target.the("Lugar donde se escribe lo que se desea traducir").located(By.id("source"));
    public static final Target AREA_TRADUCIDA = Target.the("El area donde muesta la traduccion").located(By.xpath("//span[@class='tlid-translation translation']/span"));
    public static final Target BUSCAR_LENGUAJE_ORIGEN = Target.the("El area donde se bucasca el idioma en que se va a escribir").located(By.id("sl_list-search-box"));
    public static final Target BUSCAR_LENGUAJE_DESTINO = Target.the("El area donde se bucasca el idioma en que se va a escribir").located(By.id("tl_list-search-box"));

    /*
    //span[@lang='es']
    span.tlid-translation.translation>span
    //div[@class='result-shield-container tlid-copy-target']
    //span[@class='tlid-translation translation']/span
     */

}
