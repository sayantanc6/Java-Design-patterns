package designpattern.builder;

public class Smart implements Personality {

	@Override
	public String walk() {
		return "walk_smart";
	}

	@Override
	public String eat() {
		return "eat_sharp";
	}

	@Override
	public String sleep() {
		return "straight_sleep";
	}

	@Override
	public String talk() {
		return "formal_talk";
	}

	@Override
	public String toString() {
		return "\n walking : " + walk() + ",\n eating : " + eat() + ",\n sleeping : " + sleep() + ",\n talking : " + talk() + "\n";
	}

}
