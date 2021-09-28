package com.sophos.terpel.automation_terpel.interactions;


import org.jetbrains.annotations.NotNull;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class QuienesSomos implements Interaction {

	private Target target;

	public QuienesSomos(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
	}

	@NotNull
	public static QuienesSomos ir(Target target) {
		return Tasks.instrumented(QuienesSomos.class, target);
	}

}
