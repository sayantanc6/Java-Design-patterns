package designpattern.adapter;

public class Cloth implements Iron {
	
	private boolean clothStraightening = false;

	@Override
	public void ironing() {
		System.out.println("ironing without electricity");
		clothStraightening = false;
		System.out.println("cloth straightened : "+isClothStraightening());
	}
 
	public boolean isClothStraightening() {
		return clothStraightening;
	}

	public void setClothStraightening(boolean clothStraightening) {
		this.clothStraightening = clothStraightening;
	}
}
