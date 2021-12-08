package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * The type App menu bar that extends JMenuBar
 */
public class AppMenuBar extends JMenuBar {

	/**
	 * Instantiates a new App menu bar.
	 *
	 * @param menubarListener the menubar listener
	 */
	public AppMenuBar(ActionListener menubarListener) {
		super();
		JMenu appMenu = new JMenu("Update Model");
		JMenuItem menuItem = new JMenuItem("Save input centimeters");
		menuItem.addActionListener(menubarListener);
		KeyStroke shortCut = KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.ALT_DOWN_MASK);
		menuItem.setAccelerator(shortCut);
		appMenu.add(menuItem);
		super.add(appMenu);
	}
}
