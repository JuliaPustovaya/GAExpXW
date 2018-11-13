package Exp3;

import java.util.ArrayList;

public class RunApplication {

	public static ArrayList<TimeSeria> timeSeria = new ArrayList<TimeSeria>();
	public static ArrayList<UpdatedTimeSeria> updatedTimeSerias = new ArrayList<UpdatedTimeSeria>();
	public static ArrayList<Double> realResult = new ArrayList<>();
	public static ArrayList<Double> forecastResult = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		ReadFromFile.openFile(timeSeria, realResult);
		InitialIndexis initialIndexis = new InitialIndexis();
		initialIndexis.formS0();
		System.out.println("s0 " + initialIndexis.getS0());
		initialIndexis.formB0();
		System.out.println("b0 " + initialIndexis.getB0());
		initialIndexis.formC0();
		System.out.println("c0 " + initialIndexis.getC0());
		FormattedIndexis formattedIndexis = new FormattedIndexis();
		for (int i = 1; i <= timeSeria.size(); i++) {
			formattedIndexis.formSt(i);
		}
		System.out.println(updatedTimeSerias);
		WriteToFile.writeToFile(updatedTimeSerias, "Updated St, Bt, Ct");
		Forecasting forecasting = new Forecasting();
		forecasting.getForecastedValues(updatedTimeSerias, 10);
		System.out.println("Forecasted values: " + forecastResult);
		WriteToFile.writeToFile(forecastResult, "Forecasted values : ");
	//	ErrorCoeficients.getMSE(realResult, forecastResult);
	//	ErrorCoeficients.getE(realResult, forecastResult);
	}
}
