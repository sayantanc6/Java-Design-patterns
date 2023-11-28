package designpattern.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		String url = "www.google.com";
		ProxyContract proxyContract = new ProxyRouter(url,false);
		proxyContract.allowedURLs(url);
	}
}
