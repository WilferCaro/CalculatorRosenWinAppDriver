package com.rosen.ScreenplayWinAppGradle.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Numbers extends PageObject {
	public static Target BOTON_2 = Target.the("Botón 2").located(By.name("Dos"));
	public static Target BOTON_MAS = Target.the("Botón Más").located(By.name("Más"));
	public static Target BOTON_4 = Target.the("Botón 4").located(By.name("Cuatro"));
	public static Target BOTON_6 = Target.the("Botón 6").located(By.name("Seis"));
	public static Target BOTON_8 = Target.the("Botón 8").located(By.name("Ocho"));
	public static Target BOTON_IGUAL = Target.the("Botón igual a").located(By.name("Es igual a"));
	public static Target BOTON_MENOS = Target.the("Botón Menos").located(By.name("Menos"));
	public static Target BOTON_9 = Target.the("Botón 9").located(By.name("Nueve"));
	public static Target BOTON_7 = Target.the("Botón 7").located(By.name("Siete"));
	public static Target BOTON_5 = Target.the("Botón 5").located(By.name("Cinco"));
	public static Target BOTON_3 = Target.the("Botón 3").located(By.name("Tres"));
	public static Target BOTON_1 = Target.the("Botón 1").located(By.name("Uno"));
}
