package Exp3;

import java.util.ArrayList;

public class ErrorCoeficients {
	public static double MSE;                             //среднеквадратическая ошибка

	public static double getMSE(ArrayList<TimeSeria> initial, ArrayList<Double> forecasted) {
		double temp = 0.0;
		for (int i = 0; i < initial.size(); i++) {
			temp = temp + Math.pow((initial.get(i).getYt() - forecasted.get(i)), 2);
		}
		return MSE = (1.0 / (double) initial.size()) * temp;
	}
}
