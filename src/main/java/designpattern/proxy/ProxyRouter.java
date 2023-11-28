package designpattern.proxy;

import java.util.regex.Pattern;

public class ProxyRouter implements ProxyContract {
	
	@SuppressWarnings("unused")
	private String url="";
	private Internet internet;
	private String regex="^(.*porn.*)|([x]+)|(x[a-z]+)|([^<you>]tube)|(.*sex.*)$";
	boolean adult = false;
	
	public ProxyRouter(String url,boolean adult) {
		this.url = url;
		this.adult = adult;
	}

	@Override 
	public ProxyContract allowedURLs(String url) { 

		if (adult == false && Pattern.compile(regex).matcher(url).find())
			System.out.println("sensitive url is not allowed : "+url);
		 else 
			internet = new Internet(url);
		
		return internet;
		
	}
	
	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}



	private class Internet implements ProxyContract{
		
		@SuppressWarnings("unused")
		private String url;
		
		public Internet(String url) {
			this.url = url;
			allowedURLs(url);
		}

		@Override
		public ProxyContract allowedURLs(String url) {
			System.out.println("Welcome to : "+url); 
			return null;
		}
	}
}
