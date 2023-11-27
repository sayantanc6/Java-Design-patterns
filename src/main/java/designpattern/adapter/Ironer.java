package designpattern.adapter;

public class Ironer implements Iron{

	Iron iron;

	public Ironer(Iron iron) {
		super();
		this.iron = iron;
	}

	@Override
	public void ironing() {
		iron.ironing();
	}
}
