package Exp3;

public class UpdatedTimeSeria {

	private Double sT=0.0;
	private Double bT=0.0;
	private Double cT=0.0;

	public Double getsT() {
		return sT;
	}

	public void setsT(Double sT) {
		this.sT = sT;
	}

	@Override
	public String toString() {
		return "\n"+"{" +
				"sT=" + sT +
				", bT=" + bT +
				", cT=" + cT +
				'}'+"\n";
	}

	public Double getbT() {
		return bT;
	}

	public void setbT(Double bT) {
		this.bT = bT;
	}

	public Double getcT() {
		return cT;
	}

	public void setcT(Double cT) {
		this.cT = cT;
	}

	public UpdatedTimeSeria(Double sT, Double bT, Double cT) {
		this.sT = sT;
		this.bT = bT;
		this.cT = cT;
	}
}
