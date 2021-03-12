package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target NAME_COURSE = Target.the( "Extraer nombre del curso").located(By.xpath("//button[contains(@class='course-image-view')]"));
    public static final Target BUTTON_UC = Target.the("Selecciona cursos y certificaciones").located(By.xpath("//button[contains(@class='course-image-view')]"));
    public static final Target CONTINUE = Target.the("Continuar").located(By.id("single_button604af417cce3114"));

}
