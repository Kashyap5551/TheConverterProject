package model;

import java.util.List;

/**
 * The interface Subject.
 */
public interface Subject {
	/**
	 * Attach.
	 *
	 * @param Observer type
	 */
	public void attach(Observer o);

	/**
	 * Detach.
	 *
	 * @param Observer type
	 */
	public void detach(Observer o);

	/**
	 * Notify observer string.
	 *
	 * @param validObserver the valid observer
	 * @return the string
	 */
	public String notifyObserver(Observer validObserver);
}
