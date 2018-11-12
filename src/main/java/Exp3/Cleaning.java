package Exp3;

import static Exp3.RunApplication.forecastResult;
import static Exp3.RunApplication.timeSeria;
import static Exp3.RunApplication.updatedTimeSerias;

public class Cleaning {
	public static void cleanVaribles() {
		timeSeria.clear();
		updatedTimeSerias.clear();
		forecastResult.clear();
	}
}
