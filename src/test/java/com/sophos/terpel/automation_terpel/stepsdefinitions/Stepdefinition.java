package com.sophos.terpel.automation_terpel.stepsdefinitions;

import com.sophos.terpel.automation_terpel.exceptions.NoFoundTextException;
import com.sophos.terpel.automation_terpel.interactions.QuienesSomos;
import com.sophos.terpel.automation_terpel.questions.QuestionGetVision;
import com.sophos.terpel.automation_terpel.userinterface.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.CoreMatchers.containsString;

public class Stepdefinition {

	@Before
	public void preconditions() {
	//	setTheStage(new OnlineCast());
	}

	@Dado("La aplicación de terpel y el usuario {string}")
	public void la_aplicación_de_terpel(String nameActor) {

	//	theActorCalled(nameActor);
	//	theActorInTheSpotlight().wasAbleTo(Open.browserOn(new HomePage()));
	}

	@Cuando("El usuario va la pestaña de quienes somos")
	public void el_usuario_va_la_pestaña_de_quienes_somos() {
	//	theActorInTheSpotlight().attemptsTo(QuienesSomos.ir(HomePage.QUIENES_SOMOS_LINK));
	}

	@Entonces("valida que la misión contenga {string}")
	public void valida_que_la_misión_contenga(String text) {
	//	theActorInTheSpotlight().should(seeThat(QuestionGetVision.getText(), containsString(text)).orComplainWith(
	//			NoFoundTextException.class, "No se encontro el texto buscado contenido en el elemento en la página"));
	}

}
