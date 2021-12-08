package view;

import javax.swing.*;
import java.awt.*;

/**
 * The type App panel that extends the Jpanel class.
 */
public class AppPanel extends JPanel {
	private String input = "";
	private final Font font;
	private YellowView yellow;
	private GreenView green;
	private OrangeView orange;

	/**
	 * Instantiates a new App panel.
	 */
	public AppPanel() {
		super(null);
		super.setBackground(Color.WHITE);
		font = new Font("UI", Font.BOLD, 15);
		initViews();
		this.add(green);
		this.add(orange);
		this.add(yellow);
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 8);
	}

	private void initViews() {
		yellow = new YellowView(this, font);
		green = new GreenView(this, font);
		orange = new OrangeView(this, font);
		yellow.getViewInfo().attach(orange.getViewInfo());
		yellow.getViewInfo().attach(green.getViewInfo());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	/**
	 * Gets yellow view.
	 *
	 * @return the yellow view
	 */
	public YellowView getYellowView() {
		return yellow;
	}

	/**
	 * Gets orange view.
	 *
	 * @return the orange view
	 */
	public OrangeView getOrangeView() {
		return orange;
	}

	/**
	 * Gets green view.
	 *
	 * @return the green view
	 */
	public GreenView getGreenView() {
		return green;
	}

	/**
	 * Converts the centimeters to meters and feet.
	 */
	public void convert() {
		yellow.getViewInfo().update(yellow.getText());
		orange.update();
		green.update();
	}

	/**
	 * Gets input.
	 *
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * Sets input.
	 *
	 * @param input the input
	 */
	public void setInput(String input) {
		this.input = input;
	}
}
