package com.sophos.terpel.automation_terpel.questions;

import com.sophos.terpel.automation_terpel.userinterface.PageAboutUs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class QuestionGetVision implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PageAboutUs.SUMMARY_VISION).viewedBy(actor).asString();
	}
	
	public static QuestionGetVision getText() {
		return new QuestionGetVision();
	}

}
