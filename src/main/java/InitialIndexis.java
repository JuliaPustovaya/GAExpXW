
public class InitialIndexis {
	private Double S0;
	private Double b0;
	private Double c0;

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

	public Double getC0() {
		return c0;
	}

	public void setC0(Double c0) {
		this.c0 = c0;
	}

	public Double formS0() {
		for (int i = 0; i < Coefficients.L; i++) {
			S0 = S0 + ReadFromFile.timeSeria.get(i).getYt();
		}
		return S0 = S0 / Coefficients.L;
	}
	public double formB0(){
		for (int i = 0; i < ; i++) {
			
		}
	}
}
