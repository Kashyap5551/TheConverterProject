package model;

import javax.swing.*;

/**
 * The type Orange view info that implements the Observer interface.
 */
public class OrangeViewInfo extends JTextArea implements Observer {
	private final Subject subject;
	private String info;

	/**
	 * Instantiates a new Orange view info.
	 *
	 * @param subject the subject
	 */
	public OrangeViewInfo(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void observe() {
		info = subject.notifyObserver(this);
		double m = Double.parseDouble(info) / 100;
		info = String.format("%.2f", m) + " m";
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
