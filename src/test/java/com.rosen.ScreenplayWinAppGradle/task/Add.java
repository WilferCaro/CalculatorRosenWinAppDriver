package com.rosen.ScreenplayWinAppGradle.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import com.rosen.ScreenplayWinAppGradle.ui.Numbers;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Add implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(Numbers.BOTON_2));
		actor.attemptsTo(
				Click.on(Numbers.BOTON_MAS),
				Click.on(Numbers.BOTON_4),
				Click.on(Numbers.BOTON_MAS),
				Click.on(Numbers.BOTON_6),
				Click.on(Numbers.BOTON_MAS),
				Click.on(Numbers.BOTON_8),
				Click.on(Numbers.BOTON_IGUAL),
				Click.on(Numbers.BOTON_MENOS),
				Click.on(Numbers.BOTON_9),
				Click.on(Numbers.BOTON_MENOS),
				Click.on(Numbers.BOTON_7),
				Click.on(Numbers.BOTON_MENOS),
				Click.on(Numbers.BOTON_5),
				Click.on(Numbers.BOTON_MENOS),
				Click.on(Numbers.BOTON_3),
				Click.on(Numbers.BOTON_MENOS),
				Click.on(Numbers.BOTON_1),
				Click.on(Numbers.BOTON_IGUAL)
				);
		
	}
	
	public static Add theApp() {		
		return instrumented(Add.class);
	}
}
