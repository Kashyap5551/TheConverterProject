package model;

import view.AppPanel;
import view.YellowView;

/**
 * The type Save input centimeters command.
 */
public class SaveInputCentiCommand implements Command {
	private final AppPanel panel;

	/**
	 * Instantiates a new Save input centi command.
	 *
	 * @param panel the panel
	 */
	public SaveInputCentiCommand(AppPanel panel) {
		this.panel = panel;
	}

	public void invoke() {
		YellowView yellow = panel.getYellowView();
		yellow.getViewInfo().update(yellow.getText());
		panel.getGreenView().update();
		panel.getOrangeView().update();
	}
}
