package com.luofragme.design.CommandMode;

/**
 * ����
 */
public class CreateCommand implements Command {
	private Receiver receiver;
	private String state;

	public CreateCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

	@Override
	public void undo() {
		receiver.unAction();
	}
}
