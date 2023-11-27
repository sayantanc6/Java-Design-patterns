package designpattern.chainofresponsibility;

public interface FilterChain {

	void nextInChain(FilterChain chain);
	void processRequest(Request request)throws Exception;
}
