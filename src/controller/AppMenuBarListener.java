package controller;

import model.Command;
import model.SaveInputCentiCommand;
import view.AppPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMenuBarListener implements ActionListener {
	private final AppPanel panel;
	private final Command command;

	public AppMenuBarListener(AppPanel panel) {
		this.panel = panel;
		this.command = new SaveInputCentiCommand(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		command.invoke();
	}
}
