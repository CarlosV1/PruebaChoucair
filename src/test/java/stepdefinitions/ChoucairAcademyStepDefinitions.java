package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.search;

import java.util.List;


public class ChoucairAcademyStepDefinitions
{
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Carlos wants to learn automation at the academy Choucair$")
    public void than_carlos_wants_to_learn_automation_at_the_academy_choucair(List<AcademyChoucairData> academyChoucairData) throws Exception  {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void he_search_for_the_course_recursos_automatizacion_bancolombia_on_the_choucair_academy_platform(List<AcademyChoucairData> academyChoucairData) throws Exception   {
        OnStage.theActorInTheSpotlight().attemptsTo(search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called resources (.*)$")
    public void he_finds_the_course_called_resources_automatizacion_bancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception   {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }

}
