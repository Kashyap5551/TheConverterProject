package view;

import model.YellowViewInfo;

import javax.swing.*;
import java.awt.*;

/**
 * The type Yellow view.
 */
public class YellowView extends JTextArea {
	private YellowViewInfo viewInfo;
	private AppPanel panel;

	/**
	 * Instantiates a new Yellow view.
	 *
	 * @param panel the panel
	 * @param font  the font
	 */
	public YellowView(AppPanel panel, Font font) {
		super();
		viewInfo = new YellowViewInfo();
		this.panel = panel;
		super.setBounds(200, 220, 210, 200);
		super.setBackground(Color.YELLOW);
		super.setFont(font);
	}

	/**
	 * Sets state.
	 *
	 * @param state the state
	 */
	public void setState(String state) {
		viewInfo.update(state);
	}

	/**
	 * Gets state.
	 *
	 * @return the state
	 */
	public String getState() {
		return viewInfo.getState();
	}

	/**
	 * Gets view info.
	 *
	 * @return the view info
	 */
	public YellowViewInfo getViewInfo() {
		return viewInfo;
	}
}
