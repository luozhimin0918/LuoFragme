package com.luofragme.design.IntermediaryModel;

abstract class AbstractColleague2 {
	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// ע������Ĳ���������ͬ���࣬����һ���н���
	public abstract void setNumber(int number, AbstractMediator am);
}

class ColleagueA2 extends AbstractColleague2 {

	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.AaffectB();
	}
}

class ColleagueB2 extends AbstractColleague2 {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}
}

abstract class AbstractMediator {
	protected AbstractColleague2 A;
	protected AbstractColleague2 B;

	public AbstractMediator(AbstractColleague2 a, AbstractColleague2 b) {
		A = a;
		B = b;
	}

	public abstract void AaffectB();

	public abstract void BaffectA();

}

class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague2 a, AbstractColleague2 b) {
		super(a, b);
	}

	// ����A��B��Ӱ��
	public void AaffectB() {
		int number = A.getNumber();
		B.setNumber(number * 100);
	}

	// ����B��A��Ӱ��
	public void BaffectA() {
		int number = B.getNumber();
		A.setNumber(number / 100);
	}
}

public class Client2 {
}
