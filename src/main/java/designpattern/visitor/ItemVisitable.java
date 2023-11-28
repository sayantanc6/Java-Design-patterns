package designpattern.visitor;

public interface ItemVisitable {

	float accept(ItemVisitor visitor);
}
