import java.util.Scanner;
/**
 * Write a description of class Won2Dollar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
}


