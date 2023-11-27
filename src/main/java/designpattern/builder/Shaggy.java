package designpattern.builder;

public class Shaggy implements Personality {

	@Override
	public String walk() {
		return "shaggy_walk";
	}

	@Override
	public String eat() {
		return "gulp_eat";
	}

	@Override
	public String sleep() {
		return "inverted_sleep";
	}

	@Override
	public String talk() {
		return "passive_aggressive_talk";
	}

	@Override
	public String toString() {
		return "\n walking : " + walk() + ",\n eating : " + eat() + ",\n sleeping : " + sleep() + ",\n talking : " + talk() + "\n";
	}

}
