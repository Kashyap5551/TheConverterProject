package view;

import model.OrangeViewInfo;
import javax.swing.*;
import java.awt.*;

/**
 * The type Orange view.
 */
public class OrangeView extends JTextArea {

	private OrangeViewInfo viewInfo;
	private AppPanel panel;

	/**
	 * Instantiates a new Orange view.
	 *
	 * @param panel the panel
	 * @param font  the font
	 */
	public OrangeView(AppPanel panel, Font font) {
		super();
		viewInfo = new OrangeViewInfo(panel.getYellowView().getViewInfo());
		super.setBounds(310, 10, 200, 200);
		super.setBackground(Color.ORANGE);
		super.setFont(font);
		super.setEditable(false);
	}

	/**
	 * Update.
	 */
	public void update() {
		viewInfo.observe();
		super.setText(viewInfo.getInfo());
	}

	/**
	 * Gets view info.
	 *
	 * @return the view info
	 */
	public OrangeViewInfo getViewInfo() {
		return viewInfo;
	}
}
