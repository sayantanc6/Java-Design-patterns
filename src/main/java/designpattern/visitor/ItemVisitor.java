package designpattern.visitor;

public interface ItemVisitor {

	float getPrice(Apple apple);
	float getPrice(Orange orange);
	float getPrice(Guava guava);
}
