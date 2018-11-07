import java.util.ArrayList;

public class TimeSeria {
	private Integer t;
	private Double Yt;
	private Integer Lindex;


	public TimeSeria(Integer t, Double yt) {
		this.t = t;
		Yt = yt;
	}

	@Override
	public String toString() {
		return "TimeSeria{" +
				"t=" + t +
				", Yt=" + Yt +
				'}';
	}

	public Integer getT() {
		return t;
	}

	public void setT(Integer t) {
		this.t = t;
	}

	public Double getYt() {
		return Yt;
	}

	public void setYt(Double yt) {
		Yt = yt;
	}
}
