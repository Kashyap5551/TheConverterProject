package model;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Yellow view info that implements the Observer interface.
 */
public class YellowViewInfo implements Subject {
	private String state;
	private final List<Observer> observers;

	/**
	 * Instantiates a new Yellow view info.
	 */
	public YellowViewInfo() {
		observers = new ArrayList<>();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public String notifyObserver(Observer validObserver) {
		if (observers.contains(validObserver)) {
			return state;
		}
		return null;
	}

	/**
	 * Updates the state.
	 *
	 * @param newState the new state
	 */
	public void update(String newState) {
		state = newState;
		for (Observer o : observers) {
			notifyObserver(o);
		}
	}

	/**
	 * Gets state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}
}
