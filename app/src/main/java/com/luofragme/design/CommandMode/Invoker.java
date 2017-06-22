package com.luofragme.design.CommandMode;

public class Invoker {
	/**
	 * �����߳����������
	 */
	private Command command;

	/**
	 * �����������
	 * 
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	/**
	 * ִ������
	 */
	public void runCommand() {
		command.execute();
	}

	/**
	 * ��������
	 */
	public void unDoCommand() {
		command.undo();
	}
}