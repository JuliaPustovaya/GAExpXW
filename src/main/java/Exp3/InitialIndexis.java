package Exp3;

import java.util.ArrayList;

import static Exp3.Coefficients.L;
import static Exp3.RunApplication.timeSeria;


public class InitialIndexis {
    public static Double S0 = 0.0;
    public static Double b0 = 0.0;
    public static ArrayList<Double> c0 = new ArrayList<Double>();

    public Double getS0() {
        return S0;
    }

    public void setS0(Double s0) {
        S0 = s0;
    }

    public Double getB0() {
        return b0;
    }

    public void setB0(Double b0) {
        this.b0 = b0;
    }

    public ArrayList<Double> getC0() {
        return c0;
    }

    public void setC0(ArrayList<Double> c0) {
        this.c0 = c0;
    }

    public Double formS0() {
        for (int i = 0; i < L; i++) {
            S0 = S0 + timeSeria.get(i).getYt();
        }
        return S0 = S0 / L;
    }

    public double formB0() {
        double sum = 0.0;
        for (int i = 1; i <= L; i++) {
            sum = sum + (timeSeria.get(L + i - 1).getYt() - timeSeria.get(i - 1).getYt()) / (double) L;
        }
        return b0 = sum / L;
    }

    public ArrayList<Double> formC0() {
        double sum = 0.0;
        for (int i = 1; i <= L; i++) {
            c0.add(timeSeria.get(i - 1).getYt() / (double) getS0());
        }
        return c0;
    }
}
