package Exp3;

import static Exp3.Coefficients.L;
import static Exp3.RunApplication.forecastResult;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Forecasting {
	public ArrayList<Double> getForecastedValues(ArrayList<UpdatedTimeSeria> StList, int m) {
		int t = StList.size();
		for (int i = 1; i <= m; i++) {
			int m1 = (i > L) ? (i % L) : i;
			double temp = (StList.get(t - 1).getsT() + i * StList.get(t - 1).getbT()) * StList.get(t - L + m1 - 1).getcT();
			forecastResult.add(temp);
		}
		return forecastResult;
	}
	public ArrayList<Double> getForecastedValuesUpdated(ArrayList<UpdatedTimeSeria> StList, int m) {
		int t = StList.size();
		for (int i = 1; i <= m; i++) {
			int m1 = ((t - L + i) > t) ? ((t - L + i) % L) : (t - L + i);
			double temp = (StList.get(t - 1).getsT() + i * StList.get(t - 1).getbT()) * StList.get( m1 - 1).getcT();
			System.out.println(temp
			);
				forecastResult.add(temp);
		}
		return forecastResult;
	}
	public static void printForecastedValues(ArrayList<Double> list) {
		System.out.println("Foretasted values:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i= " + (i+1) + " value= " + new DecimalFormat("#0.000").format(list.get(i)));
		}
	}
}
