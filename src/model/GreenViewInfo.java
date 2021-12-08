package model;

/**
 * The Green view info that implements the Observer interface.
 */
public class GreenViewInfo implements Observer {
	private final Subject subject;
	private String info;

	/**
	 * Instantiates a new Green view info.
	 *
	 * @param subject the subject
	 */
	public GreenViewInfo(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void observe() {
		info = subject.notifyObserver(this);
		double feet = Double.parseDouble(info) / 30.48;
		info = String.format("%.11f", feet) + " ft";
	}

	/**
	 * Gets info.
	 *
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
}
